$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'nodeexpense/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'pk', index: 'pk', width: 80 }, 			
			{ label: '', name: 'userid', index: 'userid', width: 80 }, 			
			{ label: '', name: 'descript', index: 'descript', width: 80 }, 			
			{ label: '', name: 'expenseDate', index: 'expense_date', width: 80 }, 			
			{ label: '', name: 'money', index: 'money', width: 80 }, 			
			{ label: '', name: 'ts', index: 'ts', width: 80 }, 			
			{ label: '', name: 'djlxpk', index: 'djlxpk', width: 80 }, 			
			{ label: '', name: 'billstatus', index: 'billstatus', width: 80 }, 			
			{ label: '', name: 'billtypecode', index: 'billtypecode', width: 80 }, 			
			{ label: '', name: 'billtypename', index: 'billtypename', width: 80 }, 			
			{ label: '', name: 'pkBill', index: 'pk_bill', width: 80 }, 			
			{ label: '', name: 'dealdate', index: 'dealdate', width: 80 }, 			
			{ label: '', name: 'valid', index: 'valid', width: 80 }, 			
			{ label: '自定义项', name: 'zdyhead', index: 'zdyhead', width: 80 }, 			
			{ label: '项目名称', name: 'zdyheadvalue', index: 'zdyheadValue', width: 80 }, 			
			{ label: '个人银行key', name: 'bankaccountkey', index: 'bankAccountKey', width: 80 }, 			
			{ label: '个人银行账号名称', name: 'bankaccount', index: 'bankAccount', width: 80 }, 			
			{ label: '收支项目key', name: 'szitemkey', index: 'szitemKey', width: 80 }, 			
			{ label: '收支项目value', name: 'szitemvalue', index: 'szitemValue', width: 80 }, 			
			{ label: '', name: 'requisitionkey', index: 'requisitionKey', width: 80 }, 			
			{ label: '', name: 'requisition', index: 'requisition', width: 80 }, 			
			{ label: '', name: 'errormsg', index: 'errorMsg', width: 80 }, 			
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
			{ label: '申请单pk', name: 'sqdpk', index: 'sqdpk', width: 80 }, 			
			{ label: '费用承担单位', name: 'assumeOrg', index: 'assume_org', width: 80 }, 			
			{ label: '费用承担部门', name: 'assumeDept', index: 'assume_dept', width: 80 }, 			
			{ label: '', name: 'reductionAmount', index: 'reduction_amount', width: 80 }, 			
			{ label: '', name: 'reductionTime', index: 'reduction_time', width: 80 }, 			
			{ label: '', name: 'overStandard', index: 'over_standard', width: 80 }, 			
			{ label: '', name: 'reimbursePerson', index: 'reimburse_person', width: 80 }, 			
			{ label: '', name: 'agencyStatus', index: 'agency_status', width: 80 }, 			
			{ label: '', name: 'overBudgetStatus', index: 'over_budget_status', width: 80 }, 			
			{ label: '', name: 'payAmount1', index: 'pay_amount1', width: 80 }, 			
			{ label: '', name: 'payAmount2', index: 'pay_amount2', width: 80 }, 			
			{ label: '行政组织', name: 'adminOrg', index: 'admin_org', width: 80 }, 			
			{ label: '财务组织', name: 'financeOrg', index: 'finance_org', width: 80 }, 			
			{ label: '报销部门', name: 'reimburseDept', index: 'reimburse_dept', width: 80 }, 			
			{ label: '币种', name: 'currency', index: 'currency', width: 80 }, 			
			{ label: '汇率', name: 'exchangeRate', index: 'exchange_rate', width: 80 }, 			
			{ label: '本币金额', name: 'localMoney', index: 'local_money', width: 80 }, 			
			{ label: '支付余额', name: 'restPayMoney', index: 'rest_pay_money', width: 80 }, 			
			{ label: '经办人所属组织', name: 'userOrg', index: 'user_org', width: 80 }, 			
			{ label: '对公or对私', name: 'payType', index: 'pay_type', width: 80 }, 			
			{ label: '收款对象', name: 'reveiveType', index: 'reveive_type', width: 80 }, 			
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
		nodeExpense: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.nodeExpense = {};
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
			var url = vm.nodeExpense.id == null ? "nodeexpense/save" : "nodeexpense/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.nodeExpense),
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
				    url: baseURL + "nodeexpense/delete",
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
			$.get(baseURL + "nodeexpense/info/"+id, function(r){
                vm.nodeExpense = r.nodeExpense;
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