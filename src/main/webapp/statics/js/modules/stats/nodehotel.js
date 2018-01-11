$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'nodehotel/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'pk', index: 'pk', width: 80 }, 			
			{ label: '', name: 'userId', index: 'user_id', width: 80 }, 			
			{ label: '', name: 'money', index: 'money', width: 80 }, 			
			{ label: '', name: 'city', index: 'city', width: 80 }, 			
			{ label: '', name: 'startDate', index: 'start_date', width: 80 }, 			
			{ label: '', name: 'endDate', index: 'end_date', width: 80 }, 			
			{ label: '', name: 'hotel', index: 'hotel', width: 80 }, 			
			{ label: '', name: 'note', index: 'note', width: 80 }, 			
			{ label: '', name: 'filepath', index: 'filepath', width: 80 }, 			
			{ label: '', name: 'expense', index: 'expense', width: 80 }, 			
			{ label: '', name: 'valid', index: 'valid', width: 80 }, 			
			{ label: '', name: 'category', index: 'category', width: 80 }, 			
			{ label: '', name: 'ts', index: 'ts', width: 80 }, 			
			{ label: '', name: 'tagContent', index: 'tag_content', width: 80 }, 			
			{ label: '税率', name: 'taxrate', index: 'taxrate', width: 80 }, 			
			{ label: '税额', name: 'includtax', index: 'includtax', width: 80 }, 			
			{ label: '无税金额', name: 'nottax', index: 'nottax', width: 80 }, 			
			{ label: '发票号', name: 'invoicenum', index: 'invoicenum', width: 80 }, 			
			{ label: '预留字段', name: 'demo1', index: 'demo1', width: 80 }, 			
			{ label: '', name: 'imagesystemtype', index: 'imagesystemtype', width: 80 }, 			
			{ label: '', name: 'overStandard', index: 'over_standard', width: 80 }, 			
			{ label: '', name: 'citypk', index: 'citypk', width: 80 }, 			
			{ label: '', name: 'itemPk', index: 'item_pk', width: 80 }, 			
			{ label: '', name: 'itemName', index: 'item_name', width: 80 }, 			
			{ label: '', name: 'szitemPk', index: 'szitem_pk', width: 80 }, 			
			{ label: '', name: 'szitemName', index: 'szitem_name', width: 80 }, 			
			{ label: '', name: 'reductionAmount', index: 'reduction_amount', width: 80 }, 			
			{ label: '', name: 'reductionInfo', index: 'reduction_info', width: 80 }, 			
			{ label: '', name: 'reductionTime', index: 'reduction_time', width: 80 }			
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
		nodeHotel: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.nodeHotel = {};
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
			var url = vm.nodeHotel.id == null ? "nodehotel/save" : "nodehotel/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.nodeHotel),
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
				    url: baseURL + "nodehotel/delete",
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
			$.get(baseURL + "nodehotel/info/"+id, function(r){
                vm.nodeHotel = r.nodeHotel;
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