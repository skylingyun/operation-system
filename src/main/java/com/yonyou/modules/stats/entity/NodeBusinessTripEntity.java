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
public class NodeBusinessTripEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String pk;
	//用户id
	private String userId;
	//出差申请金额
	private Double money;
	//城市
	private String city;
	//项目pk
	private String zdyhead;
	//项目
	private String zdyheadvalue;
	//事由
	private String descript;
	//开始时间
	private Date startDate;
	//结束时间
	private Date endDate;
	//
	private Date ts;
	//
	private Integer billstatus;
	//
	private Integer reimburstatus;
	//
	private String pkBill;
	//
	private Date dealdate;
	//
	private String errormsg;
	//
	private Integer valid;
	//
	private String tagpk;
	//
	private Integer isClosed;
	//
	private Double budgetMoney;
	//余额
	private Double restMoney;
	//已用金额
	private Double usedMoney;
	//事项类型
	private String matter;
	//费用项目
	private String costProject;
	//单据大类
	private String djdl;
	//单据类型编码
	private String djlxbm;
	//单据类型名称
	private String billtype;
	//单据类型pk
	private String djlxpk;
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
	//费用承担单位
	private String assumeOrg;
	//费用承担部门
	private String assumeDept;
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
	private Integer overBudgetStatus;
	//
	private String adminOrg;
	//
	private String financeOrg;
	//
	private String applyDept;
	//
	private String applyUser;
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
	 * 设置：用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：出差申请金额
	 */
	public void setMoney(Double money) {
		this.money = money;
	}
	/**
	 * 获取：出差申请金额
	 */
	public Double getMoney() {
		return money;
	}
	/**
	 * 设置：城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：项目pk
	 */
	public void setZdyhead(String zdyhead) {
		this.zdyhead = zdyhead;
	}
	/**
	 * 获取：项目pk
	 */
	public String getZdyhead() {
		return zdyhead;
	}
	/**
	 * 设置：项目
	 */
	public void setZdyheadvalue(String zdyheadvalue) {
		this.zdyheadvalue = zdyheadvalue;
	}
	/**
	 * 获取：项目
	 */
	public String getZdyheadvalue() {
		return zdyheadvalue;
	}
	/**
	 * 设置：事由
	 */
	public void setDescript(String descript) {
		this.descript = descript;
	}
	/**
	 * 获取：事由
	 */
	public String getDescript() {
		return descript;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEndDate() {
		return endDate;
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
	public void setReimburstatus(Integer reimburstatus) {
		this.reimburstatus = reimburstatus;
	}
	/**
	 * 获取：
	 */
	public Integer getReimburstatus() {
		return reimburstatus;
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
	public void setTagpk(String tagpk) {
		this.tagpk = tagpk;
	}
	/**
	 * 获取：
	 */
	public String getTagpk() {
		return tagpk;
	}
	/**
	 * 设置：
	 */
	public void setIsClosed(Integer isClosed) {
		this.isClosed = isClosed;
	}
	/**
	 * 获取：
	 */
	public Integer getIsClosed() {
		return isClosed;
	}
	/**
	 * 设置：
	 */
	public void setBudgetMoney(Double budgetMoney) {
		this.budgetMoney = budgetMoney;
	}
	/**
	 * 获取：
	 */
	public Double getBudgetMoney() {
		return budgetMoney;
	}
	/**
	 * 设置：余额
	 */
	public void setRestMoney(Double restMoney) {
		this.restMoney = restMoney;
	}
	/**
	 * 获取：余额
	 */
	public Double getRestMoney() {
		return restMoney;
	}
	/**
	 * 设置：已用金额
	 */
	public void setUsedMoney(Double usedMoney) {
		this.usedMoney = usedMoney;
	}
	/**
	 * 获取：已用金额
	 */
	public Double getUsedMoney() {
		return usedMoney;
	}
	/**
	 * 设置：事项类型
	 */
	public void setMatter(String matter) {
		this.matter = matter;
	}
	/**
	 * 获取：事项类型
	 */
	public String getMatter() {
		return matter;
	}
	/**
	 * 设置：费用项目
	 */
	public void setCostProject(String costProject) {
		this.costProject = costProject;
	}
	/**
	 * 获取：费用项目
	 */
	public String getCostProject() {
		return costProject;
	}
	/**
	 * 设置：单据大类
	 */
	public void setDjdl(String djdl) {
		this.djdl = djdl;
	}
	/**
	 * 获取：单据大类
	 */
	public String getDjdl() {
		return djdl;
	}
	/**
	 * 设置：单据类型编码
	 */
	public void setDjlxbm(String djlxbm) {
		this.djlxbm = djlxbm;
	}
	/**
	 * 获取：单据类型编码
	 */
	public String getDjlxbm() {
		return djlxbm;
	}
	/**
	 * 设置：单据类型名称
	 */
	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}
	/**
	 * 获取：单据类型名称
	 */
	public String getBilltype() {
		return billtype;
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
	public void setAdminOrg(String adminOrg) {
		this.adminOrg = adminOrg;
	}
	/**
	 * 获取：
	 */
	public String getAdminOrg() {
		return adminOrg;
	}
	/**
	 * 设置：
	 */
	public void setFinanceOrg(String financeOrg) {
		this.financeOrg = financeOrg;
	}
	/**
	 * 获取：
	 */
	public String getFinanceOrg() {
		return financeOrg;
	}
	/**
	 * 设置：
	 */
	public void setApplyDept(String applyDept) {
		this.applyDept = applyDept;
	}
	/**
	 * 获取：
	 */
	public String getApplyDept() {
		return applyDept;
	}
	/**
	 * 设置：
	 */
	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}
	/**
	 * 获取：
	 */
	public String getApplyUser() {
		return applyUser;
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
