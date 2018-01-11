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
public class NodePaymentEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String pk;
	//
	private String userId;
	//借款金额
	private Double money;
	//还款余额
	private Double hkye;
	//还款状态
	private String hkzt;
	//
	private String descript;
	//收支项目
	private String szxm;
	//项目
	private String project;
	//
	private String bankaccountkey;
	//
	private String bankaccount;
	//
	private Date dealdate;
	//单据状态
	private Integer billstatus;
	//nc单据pk
	private String pkBill;
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
	//
	private String defitem11;
	//
	private String defitem12;
	//
	private String defitem13;
	//
	private String defitem14;
	//
	private String defitem15;
	//
	private String defitem16;
	//
	private String defitem17;
	//
	private String defitem18;
	//
	private String defitem19;
	//
	private String defitem20;
	//
	private Date ts;
	//
	private Integer valid;
	//
	private String billtype;
	//
	private String errormsg;
	//单据类型pk
	private String djlxpk;
	//是否超预算
	private Integer overBudgetStatus;
	//申请单pk
	private String sqdpk;
	//费用承担单位
	private String assumeOrg;
	//费用承担部门
	private String assumeDept;
	//行政组织
	private String adminOrg;
	//财务组织
	private String financeOrg;
	//币种
	private String currency;
	//汇率
	private Double exchangeRate;
	//本币金额
	private Double localMoney;
	//借款余额
	private Double restMoney;
	//借款部门
	private String loanDept;
	//借款人
	private String loanUser;
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
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：借款金额
	 */
	public void setMoney(Double money) {
		this.money = money;
	}
	/**
	 * 获取：借款金额
	 */
	public Double getMoney() {
		return money;
	}
	/**
	 * 设置：还款余额
	 */
	public void setHkye(Double hkye) {
		this.hkye = hkye;
	}
	/**
	 * 获取：还款余额
	 */
	public Double getHkye() {
		return hkye;
	}
	/**
	 * 设置：还款状态
	 */
	public void setHkzt(String hkzt) {
		this.hkzt = hkzt;
	}
	/**
	 * 获取：还款状态
	 */
	public String getHkzt() {
		return hkzt;
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
	 * 设置：收支项目
	 */
	public void setSzxm(String szxm) {
		this.szxm = szxm;
	}
	/**
	 * 获取：收支项目
	 */
	public String getSzxm() {
		return szxm;
	}
	/**
	 * 设置：项目
	 */
	public void setProject(String project) {
		this.project = project;
	}
	/**
	 * 获取：项目
	 */
	public String getProject() {
		return project;
	}
	/**
	 * 设置：
	 */
	public void setBankaccountkey(String bankaccountkey) {
		this.bankaccountkey = bankaccountkey;
	}
	/**
	 * 获取：
	 */
	public String getBankaccountkey() {
		return bankaccountkey;
	}
	/**
	 * 设置：
	 */
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}
	/**
	 * 获取：
	 */
	public String getBankaccount() {
		return bankaccount;
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
	 * 设置：单据状态
	 */
	public void setBillstatus(Integer billstatus) {
		this.billstatus = billstatus;
	}
	/**
	 * 获取：单据状态
	 */
	public Integer getBillstatus() {
		return billstatus;
	}
	/**
	 * 设置：nc单据pk
	 */
	public void setPkBill(String pkBill) {
		this.pkBill = pkBill;
	}
	/**
	 * 获取：nc单据pk
	 */
	public String getPkBill() {
		return pkBill;
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
	 * 设置：
	 */
	public void setDefitem11(String defitem11) {
		this.defitem11 = defitem11;
	}
	/**
	 * 获取：
	 */
	public String getDefitem11() {
		return defitem11;
	}
	/**
	 * 设置：
	 */
	public void setDefitem12(String defitem12) {
		this.defitem12 = defitem12;
	}
	/**
	 * 获取：
	 */
	public String getDefitem12() {
		return defitem12;
	}
	/**
	 * 设置：
	 */
	public void setDefitem13(String defitem13) {
		this.defitem13 = defitem13;
	}
	/**
	 * 获取：
	 */
	public String getDefitem13() {
		return defitem13;
	}
	/**
	 * 设置：
	 */
	public void setDefitem14(String defitem14) {
		this.defitem14 = defitem14;
	}
	/**
	 * 获取：
	 */
	public String getDefitem14() {
		return defitem14;
	}
	/**
	 * 设置：
	 */
	public void setDefitem15(String defitem15) {
		this.defitem15 = defitem15;
	}
	/**
	 * 获取：
	 */
	public String getDefitem15() {
		return defitem15;
	}
	/**
	 * 设置：
	 */
	public void setDefitem16(String defitem16) {
		this.defitem16 = defitem16;
	}
	/**
	 * 获取：
	 */
	public String getDefitem16() {
		return defitem16;
	}
	/**
	 * 设置：
	 */
	public void setDefitem17(String defitem17) {
		this.defitem17 = defitem17;
	}
	/**
	 * 获取：
	 */
	public String getDefitem17() {
		return defitem17;
	}
	/**
	 * 设置：
	 */
	public void setDefitem18(String defitem18) {
		this.defitem18 = defitem18;
	}
	/**
	 * 获取：
	 */
	public String getDefitem18() {
		return defitem18;
	}
	/**
	 * 设置：
	 */
	public void setDefitem19(String defitem19) {
		this.defitem19 = defitem19;
	}
	/**
	 * 获取：
	 */
	public String getDefitem19() {
		return defitem19;
	}
	/**
	 * 设置：
	 */
	public void setDefitem20(String defitem20) {
		this.defitem20 = defitem20;
	}
	/**
	 * 获取：
	 */
	public String getDefitem20() {
		return defitem20;
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
	 * 设置：
	 */
	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}
	/**
	 * 获取：
	 */
	public String getBilltype() {
		return billtype;
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
	 * 设置：单据类型pk
	 */
	public void setDjlxpk(String djlxpk) {
		this.djlxpk = djlxpk;
	}
	/**
	 * 获取：单据类型pk
	 */
	public String getDjlxpk() {
		return djlxpk;
	}
	/**
	 * 设置：是否超预算
	 */
	public void setOverBudgetStatus(Integer overBudgetStatus) {
		this.overBudgetStatus = overBudgetStatus;
	}
	/**
	 * 获取：是否超预算
	 */
	public Integer getOverBudgetStatus() {
		return overBudgetStatus;
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
	 * 设置：借款余额
	 */
	public void setRestMoney(Double restMoney) {
		this.restMoney = restMoney;
	}
	/**
	 * 获取：借款余额
	 */
	public Double getRestMoney() {
		return restMoney;
	}
	/**
	 * 设置：借款部门
	 */
	public void setLoanDept(String loanDept) {
		this.loanDept = loanDept;
	}
	/**
	 * 获取：借款部门
	 */
	public String getLoanDept() {
		return loanDept;
	}
	/**
	 * 设置：借款人
	 */
	public void setLoanUser(String loanUser) {
		this.loanUser = loanUser;
	}
	/**
	 * 获取：借款人
	 */
	public String getLoanUser() {
		return loanUser;
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
