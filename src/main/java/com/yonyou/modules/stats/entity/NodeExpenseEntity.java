package com.yonyou.modules.stats.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2018-01-09 20:20:00
 */
public class NodeExpenseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String pk;
	//
	private String userid;
	//
	private String descript;
	//
	private Date expenseDate;
	//
	private Double money;
	//
	private Date ts;
	//
	private String djlxpk;
	//
	private Integer billstatus;
	//
	private String billtypecode;
	//
	private String billtypename;
	//
	private String pkBill;
	//
	private Date dealdate;
	//
	private Integer valid;
	//自定义项
	private String zdyhead;
	//项目名称
	private String zdyheadvalue;
	//个人银行key
	private String bankaccountkey;
	//个人银行账号名称
	private String bankaccount;
	//收支项目key
	private String szitemkey;
	//收支项目value
	private String szitemvalue;
	//
	private String requisitionkey;
	//
	private String requisition;
	//
	private String errormsg;
	//
	private String defitem1;
	//
	private String defitem2;
	//
	private String defitem3;
	//
	private String defitem4;
	//
	private String defitem5;
	//
	private String defitem6;
	//
	private String defitem7;
	//
	private String defitem8;
	//
	private String defitem9;
	//
	private String defitem10;
	//申请单pk
	private String sqdpk;
	//费用承担单位
	private String assumeOrg;
	//费用承担部门
	private String assumeDept;
	//
	private Double reductionAmount;
	//
	private Date reductionTime;
	//
	private Integer overStandard;
	//
	private String reimbursePerson;
	//
	private Integer agencyStatus;
	//
	private Integer overBudgetStatus;
	//
	private Double payAmount1;
	//
	private Double payAmount2;
	//行政组织
	private String adminOrg;
	//财务组织
	private String financeOrg;
	//报销部门
	private String reimburseDept;
	//币种
	private String currency;
	//汇率
	private Double exchangeRate;
	//本币金额
	private Double localMoney;
	//支付余额
	private Double restPayMoney;
	//经办人所属组织
	private String userOrg;
	//对公or对私
	private Integer payType;
	//收款对象
	private String reveiveType;
	//单据编号
	private String billnum;
	//指派人id
	private String assignid;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	/**
	 * 获取：
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * 设置：
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * 获取：
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * 设置：
	 */
	public void setDescript(String descript) {
		this.descript = descript;
	}
	/**
	 * 获取：
	 */
	public String getDescript() {
		return descript;
	}
	/**
	 * 设置：
	 */
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	/**
	 * 获取：
	 */
	public Date getExpenseDate() {
		return expenseDate;
	}
	/**
	 * 设置：
	 */
	public void setMoney(Double money) {
		this.money = money;
	}
	/**
	 * 获取：
	 */
	public Double getMoney() {
		return money;
	}
	/**
	 * 设置：
	 */
	public void setTs(Date ts) {
		this.ts = ts;
	}
	/**
	 * 获取：
	 */
	public Date getTs() {
		return ts;
	}
	/**
	 * 设置：
	 */
	public void setDjlxpk(String djlxpk) {
		this.djlxpk = djlxpk;
	}
	/**
	 * 获取：
	 */
	public String getDjlxpk() {
		return djlxpk;
	}
	/**
	 * 设置：
	 */
	public void setBillstatus(Integer billstatus) {
		this.billstatus = billstatus;
	}
	/**
	 * 获取：
	 */
	public Integer getBillstatus() {
		return billstatus;
	}
	/**
	 * 设置：
	 */
	public void setBilltypecode(String billtypecode) {
		this.billtypecode = billtypecode;
	}
	/**
	 * 获取：
	 */
	public String getBilltypecode() {
		return billtypecode;
	}
	/**
	 * 设置：
	 */
	public void setBilltypename(String billtypename) {
		this.billtypename = billtypename;
	}
	/**
	 * 获取：
	 */
	public String getBilltypename() {
		return billtypename;
	}
	/**
	 * 设置：
	 */
	public void setPkBill(String pkBill) {
		this.pkBill = pkBill;
	}
	/**
	 * 获取：
	 */
	public String getPkBill() {
		return pkBill;
	}
	/**
	 * 设置：
	 */
	public void setDealdate(Date dealdate) {
		this.dealdate = dealdate;
	}
	/**
	 * 获取：
	 */
	public Date getDealdate() {
		return dealdate;
	}
	/**
	 * 设置：
	 */
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	/**
	 * 获取：
	 */
	public Integer getValid() {
		return valid;
	}
	/**
	 * 设置：自定义项
	 */
	public void setZdyhead(String zdyhead) {
		this.zdyhead = zdyhead;
	}
	/**
	 * 获取：自定义项
	 */
	public String getZdyhead() {
		return zdyhead;
	}
	/**
	 * 设置：项目名称
	 */
	public void setZdyheadvalue(String zdyheadvalue) {
		this.zdyheadvalue = zdyheadvalue;
	}
	/**
	 * 获取：项目名称
	 */
	public String getZdyheadvalue() {
		return zdyheadvalue;
	}
	/**
	 * 设置：个人银行key
	 */
	public void setBankaccountkey(String bankaccountkey) {
		this.bankaccountkey = bankaccountkey;
	}
	/**
	 * 获取：个人银行key
	 */
	public String getBankaccountkey() {
		return bankaccountkey;
	}
	/**
	 * 设置：个人银行账号名称
	 */
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}
	/**
	 * 获取：个人银行账号名称
	 */
	public String getBankaccount() {
		return bankaccount;
	}
	/**
	 * 设置：收支项目key
	 */
	public void setSzitemkey(String szitemkey) {
		this.szitemkey = szitemkey;
	}
	/**
	 * 获取：收支项目key
	 */
	public String getSzitemkey() {
		return szitemkey;
	}
	/**
	 * 设置：收支项目value
	 */
	public void setSzitemvalue(String szitemvalue) {
		this.szitemvalue = szitemvalue;
	}
	/**
	 * 获取：收支项目value
	 */
	public String getSzitemvalue() {
		return szitemvalue;
	}
	/**
	 * 设置：
	 */
	public void setRequisitionkey(String requisitionkey) {
		this.requisitionkey = requisitionkey;
	}
	/**
	 * 获取：
	 */
	public String getRequisitionkey() {
		return requisitionkey;
	}
	/**
	 * 设置：
	 */
	public void setRequisition(String requisition) {
		this.requisition = requisition;
	}
	/**
	 * 获取：
	 */
	public String getRequisition() {
		return requisition;
	}
	/**
	 * 设置：
	 */
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	/**
	 * 获取：
	 */
	public String getErrormsg() {
		return errormsg;
	}
	/**
	 * 设置：
	 */
	public void setDefitem1(String defitem1) {
		this.defitem1 = defitem1;
	}
	/**
	 * 获取：
	 */
	public String getDefitem1() {
		return defitem1;
	}
	/**
	 * 设置：
	 */
	public void setDefitem2(String defitem2) {
		this.defitem2 = defitem2;
	}
	/**
	 * 获取：
	 */
	public String getDefitem2() {
		return defitem2;
	}
	/**
	 * 设置：
	 */
	public void setDefitem3(String defitem3) {
		this.defitem3 = defitem3;
	}
	/**
	 * 获取：
	 */
	public String getDefitem3() {
		return defitem3;
	}
	/**
	 * 设置：
	 */
	public void setDefitem4(String defitem4) {
		this.defitem4 = defitem4;
	}
	/**
	 * 获取：
	 */
	public String getDefitem4() {
		return defitem4;
	}
	/**
	 * 设置：
	 */
	public void setDefitem5(String defitem5) {
		this.defitem5 = defitem5;
	}
	/**
	 * 获取：
	 */
	public String getDefitem5() {
		return defitem5;
	}
	/**
	 * 设置：
	 */
	public void setDefitem6(String defitem6) {
		this.defitem6 = defitem6;
	}
	/**
	 * 获取：
	 */
	public String getDefitem6() {
		return defitem6;
	}
	/**
	 * 设置：
	 */
	public void setDefitem7(String defitem7) {
		this.defitem7 = defitem7;
	}
	/**
	 * 获取：
	 */
	public String getDefitem7() {
		return defitem7;
	}
	/**
	 * 设置：
	 */
	public void setDefitem8(String defitem8) {
		this.defitem8 = defitem8;
	}
	/**
	 * 获取：
	 */
	public String getDefitem8() {
		return defitem8;
	}
	/**
	 * 设置：
	 */
	public void setDefitem9(String defitem9) {
		this.defitem9 = defitem9;
	}
	/**
	 * 获取：
	 */
	public String getDefitem9() {
		return defitem9;
	}
	/**
	 * 设置：
	 */
	public void setDefitem10(String defitem10) {
		this.defitem10 = defitem10;
	}
	/**
	 * 获取：
	 */
	public String getDefitem10() {
		return defitem10;
	}
	/**
	 * 设置：申请单pk
	 */
	public void setSqdpk(String sqdpk) {
		this.sqdpk = sqdpk;
	}
	/**
	 * 获取：申请单pk
	 */
	public String getSqdpk() {
		return sqdpk;
	}
	/**
	 * 设置：费用承担单位
	 */
	public void setAssumeOrg(String assumeOrg) {
		this.assumeOrg = assumeOrg;
	}
	/**
	 * 获取：费用承担单位
	 */
	public String getAssumeOrg() {
		return assumeOrg;
	}
	/**
	 * 设置：费用承担部门
	 */
	public void setAssumeDept(String assumeDept) {
		this.assumeDept = assumeDept;
	}
	/**
	 * 获取：费用承担部门
	 */
	public String getAssumeDept() {
		return assumeDept;
	}
	/**
	 * 设置：
	 */
	public void setReductionAmount(Double reductionAmount) {
		this.reductionAmount = reductionAmount;
	}
	/**
	 * 获取：
	 */
	public Double getReductionAmount() {
		return reductionAmount;
	}
	/**
	 * 设置：
	 */
	public void setReductionTime(Date reductionTime) {
		this.reductionTime = reductionTime;
	}
	/**
	 * 获取：
	 */
	public Date getReductionTime() {
		return reductionTime;
	}
	/**
	 * 设置：
	 */
	public void setOverStandard(Integer overStandard) {
		this.overStandard = overStandard;
	}
	/**
	 * 获取：
	 */
	public Integer getOverStandard() {
		return overStandard;
	}
	/**
	 * 设置：
	 */
	public void setReimbursePerson(String reimbursePerson) {
		this.reimbursePerson = reimbursePerson;
	}
	/**
	 * 获取：
	 */
	public String getReimbursePerson() {
		return reimbursePerson;
	}
	/**
	 * 设置：
	 */
	public void setAgencyStatus(Integer agencyStatus) {
		this.agencyStatus = agencyStatus;
	}
	/**
	 * 获取：
	 */
	public Integer getAgencyStatus() {
		return agencyStatus;
	}
	/**
	 * 设置：
	 */
	public void setOverBudgetStatus(Integer overBudgetStatus) {
		this.overBudgetStatus = overBudgetStatus;
	}
	/**
	 * 获取：
	 */
	public Integer getOverBudgetStatus() {
		return overBudgetStatus;
	}
	/**
	 * 设置：
	 */
	public void setPayAmount1(Double payAmount1) {
		this.payAmount1 = payAmount1;
	}
	/**
	 * 获取：
	 */
	public Double getPayAmount1() {
		return payAmount1;
	}
	/**
	 * 设置：
	 */
	public void setPayAmount2(Double payAmount2) {
		this.payAmount2 = payAmount2;
	}
	/**
	 * 获取：
	 */
	public Double getPayAmount2() {
		return payAmount2;
	}
	/**
	 * 设置：行政组织
	 */
	public void setAdminOrg(String adminOrg) {
		this.adminOrg = adminOrg;
	}
	/**
	 * 获取：行政组织
	 */
	public String getAdminOrg() {
		return adminOrg;
	}
	/**
	 * 设置：财务组织
	 */
	public void setFinanceOrg(String financeOrg) {
		this.financeOrg = financeOrg;
	}
	/**
	 * 获取：财务组织
	 */
	public String getFinanceOrg() {
		return financeOrg;
	}
	/**
	 * 设置：报销部门
	 */
	public void setReimburseDept(String reimburseDept) {
		this.reimburseDept = reimburseDept;
	}
	/**
	 * 获取：报销部门
	 */
	public String getReimburseDept() {
		return reimburseDept;
	}
	/**
	 * 设置：币种
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * 获取：币种
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 设置：汇率
	 */
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	/**
	 * 获取：汇率
	 */
	public Double getExchangeRate() {
		return exchangeRate;
	}
	/**
	 * 设置：本币金额
	 */
	public void setLocalMoney(Double localMoney) {
		this.localMoney = localMoney;
	}
	/**
	 * 获取：本币金额
	 */
	public Double getLocalMoney() {
		return localMoney;
	}
	/**
	 * 设置：支付余额
	 */
	public void setRestPayMoney(Double restPayMoney) {
		this.restPayMoney = restPayMoney;
	}
	/**
	 * 获取：支付余额
	 */
	public Double getRestPayMoney() {
		return restPayMoney;
	}
	/**
	 * 设置：经办人所属组织
	 */
	public void setUserOrg(String userOrg) {
		this.userOrg = userOrg;
	}
	/**
	 * 获取：经办人所属组织
	 */
	public String getUserOrg() {
		return userOrg;
	}
	/**
	 * 设置：对公or对私
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	/**
	 * 获取：对公or对私
	 */
	public Integer getPayType() {
		return payType;
	}
	/**
	 * 设置：收款对象
	 */
	public void setReveiveType(String reveiveType) {
		this.reveiveType = reveiveType;
	}
	/**
	 * 获取：收款对象
	 */
	public String getReveiveType() {
		return reveiveType;
	}
	/**
	 * 设置：单据编号
	 */
	public void setBillnum(String billnum) {
		this.billnum = billnum;
	}
	/**
	 * 获取：单据编号
	 */
	public String getBillnum() {
		return billnum;
	}
	/**
	 * 设置：指派人id
	 */
	public void setAssignid(String assignid) {
		this.assignid = assignid;
	}
	/**
	 * 获取：指派人id
	 */
	public String getAssignid() {
		return assignid;
	}
}
