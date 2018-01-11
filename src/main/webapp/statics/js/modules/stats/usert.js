$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'usert/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'userid', index: 'userid', width: 80 }, 			
			{ label: '', name: 'userName', index: 'user_name', width: 80 }, 			
			{ label: '', name: 'password', index: 'password', width: 80 }, 			
			{ label: '', name: 'description', index: 'description', width: 80 }, 			
			{ label: '', name: 'birthday', index: 'birthday', width: 80 }, 			
			{ label: '', name: 'registerdate', index: 'registerdate', width: 80 }, 			
			{ label: '', name: 'location', index: 'location', width: 80 }, 			
			{ label: '', name: 'company', index: 'company', width: 80 }, 			
			{ label: '', name: 'email', index: 'email', width: 80 }, 			
			{ label: '', name: 'phone', index: 'phone', width: 80 }, 			
			{ label: '', name: 'telnum', index: 'telnum', width: 80 }, 			
			{ label: '', name: 'avatar', index: 'avatar', width: 80 }, 			
			{ label: '', name: 'association', index: 'association', width: 80 }, 			
			{ label: '部门PK', name: 'deptpk', index: 'deptpk', width: 80 }, 			
			{ label: '部门名称', name: 'deptname', index: 'deptname', width: 80 }, 			
			{ label: '编码', name: 'userCode', index: 'user_code', width: 80 }, 			
			{ label: '', name: 'ts', index: 'ts', width: 80 }, 			
			{ label: '0: 显示 1:删除', name: 'dr', index: 'dr', width: 80 }, 			
			{ label: '岗位、职务pk', name: 'postpk', index: 'postpk', width: 80 }, 			
			{ label: '岗位、职务名称', name: 'postname', index: 'postname', width: 80 }, 			
			{ label: '职级pk', name: 'rankpk', index: 'rankpk', width: 80 }, 			
			{ label: '职级名称', name: 'rankname', index: 'rankname', width: 80 }, 			
			{ label: '部门编码', name: 'deptcode', index: 'deptcode', width: 80 }, 			
			{ label: '人员PK', name: 'personid', index: 'personId', width: 80 }, 			
			{ label: '人员名称', name: 'personname', index: 'personName', width: 80 }, 			
			{ label: '组织pk', name: 'orgpk', index: 'orgpk', width: 80 }, 			
			{ label: '组织名称', name: 'orgname', index: 'orgname', width: 80 }, 			
			{ label: '财务组织PK', name: 'financeorgid', index: 'financeOrgId', width: 80 }, 			
			{ label: '财务组织名称', name: 'financeorgname', index: 'financeOrgName', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		userT: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.userT = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.userT.id == null ? "usert/save" : "usert/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.userT),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "usert/delete",
				    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "usert/info/"+id, function(r){
                vm.userT = r.userT;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});