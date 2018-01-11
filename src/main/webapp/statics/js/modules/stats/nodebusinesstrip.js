$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'nodebusinesstrip/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'pk', index: 'pk', width: 80 }, 			
			{ label: '用户id', name: 'userId', index: 'user_id', width: 80 }, 			
			{ label: '出差申请金额', name: 'money', index: 'money', width: 80 }, 			
			{ label: '城市', name: 'city', index: 'city', width: 80 }, 			
			{ label: '项目pk', name: 'zdyhead', index: 'zdyhead', width: 80 }, 			
			{ label: '项目', name: 'zdyheadvalue', index: 'zdyheadValue', width: 80 }, 			
			{ label: '事由', name: 'descript', index: 'descript', width: 80 }, 			
			{ label: '开始时间', name: 'startDate', index: 'start_date', width: 80 }, 			
			{ label: '结束时间', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'ts', index: 'ts', width: 80 }, 			
			{ label: '', name: 'billstatus', index: 'billstatus', width: 80 }, 			
			{ label: '', name: 'reimburstatus', index: 'reimburstatus', width: 80 }, 			
			{ label: '', name: 'pkBill', index: 'pk_bill', width: 80 }, 			
			{ label: '', name: 'dealdate', index: 'dealdate', width: 80 }, 			
			{ label: '', name: 'errormsg', index: 'errorMsg', width: 80 }, 			
			{ label: '', name: 'valid', index: 'valid', width: 80 }, 			
			{ label: '', name: 'tagpk', index: 'tagPk', width: 80 }, 			
			{ label: '', name: 'isClosed', index: 'is_closed', width: 80 }, 			
			{ label: '', name: 'budgetMoney', index: 'budget_money', width: 80 }, 			
			{ label: '余额', name: 'restMoney', index: 'rest_money', width: 80 }, 			
			{ label: '已用金额', name: 'usedMoney', index: 'used_money', width: 80 }, 			
			{ label: '事项类型', name: 'matter', index: 'matter', width: 80 }, 			
			{ label: '费用项目', name: 'costProject', index: 'cost_project', width: 80 }, 			
			{ label: '单据大类', name: 'djdl', index: 'djdl', width: 80 }, 			
			{ label: '单据类型编码', name: 'djlxbm', index: 'djlxbm', width: 80 }, 			
			{ label: '单据类型名称', name: 'billtype', index: 'billtype', width: 80 }, 			
			{ label: '单据类型pk', name: 'djlxpk', index: 'djlxpk', width: 80 }, 			
			{ label: '', name: 'defitem1', index: 'defitem1', width: 80 }, 			
			{ label: '', name: 'defitem2', index: 'defitem2', width: 80 }, 			
			{ label: '', name: 'defitem3', index: 'defitem3', width: 80 }, 			
			{ label: '', name: 'defitem4', index: 'defitem4', width: 80 }, 			
			{ label: '', name: 'defitem5', index: 'defitem5', width: 80 }, 			
			{ label: '', name: 'defitem6', index: 'defitem6', width: 80 }, 			
			{ label: '', name: 'defitem7', index: 'defitem7', width: 80 }, 			
			{ label: '', name: 'defitem8', index: 'defitem8', width: 80 }, 			
			{ label: '', name: 'defitem9', index: 'defitem9', width: 80 }, 			
			{ label: '', name: 'defitem10', index: 'defitem10', width: 80 }, 			
			{ label: '费用承担单位', name: 'assumeOrg', index: 'assume_org', width: 80 }, 			
			{ label: '费用承担部门', name: 'assumeDept', index: 'assume_dept', width: 80 }, 			
			{ label: '', name: 'defitem11', index: 'defitem11', width: 80 }, 			
			{ label: '', name: 'defitem12', index: 'defitem12', width: 80 }, 			
			{ label: '', name: 'defitem13', index: 'defitem13', width: 80 }, 			
			{ label: '', name: 'defitem14', index: 'defitem14', width: 80 }, 			
			{ label: '', name: 'defitem15', index: 'defitem15', width: 80 }, 			
			{ label: '', name: 'defitem16', index: 'defitem16', width: 80 }, 			
			{ label: '', name: 'defitem17', index: 'defitem17', width: 80 }, 			
			{ label: '', name: 'defitem18', index: 'defitem18', width: 80 }, 			
			{ label: '', name: 'defitem19', index: 'defitem19', width: 80 }, 			
			{ label: '', name: 'defitem20', index: 'defitem20', width: 80 }, 			
			{ label: '', name: 'overBudgetStatus', index: 'over_budget_status', width: 80 }, 			
			{ label: '', name: 'adminOrg', index: 'admin_org', width: 80 }, 			
			{ label: '', name: 'financeOrg', index: 'finance_org', width: 80 }, 			
			{ label: '', name: 'applyDept', index: 'apply_dept', width: 80 }, 			
			{ label: '', name: 'applyUser', index: 'apply_user', width: 80 }, 			
			{ label: '单据编号', name: 'billnum', index: 'billNum', width: 80 }, 			
			{ label: '指派人id', name: 'assignid', index: 'assignid', width: 80 }			
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
		nodeBusinessTrip: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.nodeBusinessTrip = {};
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
			var url = vm.nodeBusinessTrip.id == null ? "nodebusinesstrip/save" : "nodebusinesstrip/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.nodeBusinessTrip),
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
				    url: baseURL + "nodebusinesstrip/delete",
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
			$.get(baseURL + "nodebusinesstrip/info/"+id, function(r){
                vm.nodeBusinessTrip = r.nodeBusinessTrip;
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