$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'nodepayment/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '', name: 'pk', index: 'pk', width: 80 }, 			
			{ label: '', name: 'userId', index: 'user_id', width: 80 }, 			
			{ label: '借款金额', name: 'money', index: 'money', width: 80 }, 			
			{ label: '还款余额', name: 'hkye', index: 'hkye', width: 80 }, 			
			{ label: '还款状态', name: 'hkzt', index: 'hkzt', width: 80 }, 			
			{ label: '', name: 'descript', index: 'descript', width: 80 }, 			
			{ label: '收支项目', name: 'szxm', index: 'szxm', width: 80 }, 			
			{ label: '项目', name: 'project', index: 'project', width: 80 }, 			
			{ label: '', name: 'bankaccountkey', index: 'bankAccountKey', width: 80 }, 			
			{ label: '', name: 'bankaccount', index: 'bankAccount', width: 80 }, 			
			{ label: '', name: 'dealdate', index: 'dealdate', width: 80 }, 			
			{ label: '单据状态', name: 'billstatus', index: 'billstatus', width: 80 }, 			
			{ label: 'nc单据pk', name: 'pkBill', index: 'pk_bill', width: 80 }, 			
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
			{ label: '', name: 'ts', index: 'ts', width: 80 }, 			
			{ label: '', name: 'valid', index: 'valid', width: 80 }, 			
			{ label: '', name: 'billtype', index: 'billType', width: 80 }, 			
			{ label: '', name: 'errormsg', index: 'errorMsg', width: 80 }, 			
			{ label: '单据类型pk', name: 'djlxpk', index: 'djlxpk', width: 80 }, 			
			{ label: '是否超预算', name: 'overBudgetStatus', index: 'over_budget_status', width: 80 }, 			
			{ label: '申请单pk', name: 'sqdpk', index: 'sqdpk', width: 80 }, 			
			{ label: '费用承担单位', name: 'assumeOrg', index: 'assume_org', width: 80 }, 			
			{ label: '费用承担部门', name: 'assumeDept', index: 'assume_dept', width: 80 }, 			
			{ label: '行政组织', name: 'adminOrg', index: 'admin_org', width: 80 }, 			
			{ label: '财务组织', name: 'financeOrg', index: 'finance_org', width: 80 }, 			
			{ label: '币种', name: 'currency', index: 'currency', width: 80 }, 			
			{ label: '汇率', name: 'exchangeRate', index: 'exchange_rate', width: 80 }, 			
			{ label: '本币金额', name: 'localMoney', index: 'local_money', width: 80 }, 			
			{ label: '借款余额', name: 'restMoney', index: 'rest_money', width: 80 }, 			
			{ label: '借款部门', name: 'loanDept', index: 'loan_dept', width: 80 }, 			
			{ label: '借款人', name: 'loanUser', index: 'loan_user', width: 80 }, 			
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
		nodePayment: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.nodePayment = {};
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
			var url = vm.nodePayment.id == null ? "nodepayment/save" : "nodepayment/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
			    contentType: "application/json",
			    data: JSON.stringify(vm.nodePayment),
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
				    url: baseURL + "nodepayment/delete",
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
			$.get(baseURL + "nodepayment/info/"+id, function(r){
                vm.nodePayment = r.nodePayment;
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