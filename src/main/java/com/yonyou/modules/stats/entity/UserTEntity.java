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
public class UserTEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String userid;
	//
	private String userName;
	//
	private String password;
	//
	private String description;
	//
	private Date birthday;
	//
	private Date registerdate;
	//
	private String location;
	//
	private String company;
	//
	private String email;
	//
	private String phone;
	//
	private String telnum;
	//
	private String avatar;
	//
	private String association;
	//部门PK
	private String deptpk;
	//部门名称
	private String deptname;
	//编码
	private String userCode;
	//
	private Date ts;
	//0: 显示 1:删除
	private Integer dr;
	//岗位、职务pk
	private String postpk;
	//岗位、职务名称
	private String postname;
	//职级pk
	private String rankpk;
	//职级名称
	private String rankname;
	//部门编码
	private String deptcode;
	//人员PK
	private String personid;
	//人员名称
	private String personname;
	//组织pk
	private String orgpk;
	//组织名称
	private String orgname;
	//财务组织PK
	private String financeorgid;
	//财务组织名称
	private String financeorgname;

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
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置：
	 */
	public void setRegisterdate(Date registerdate) {
		this.registerdate = registerdate;
	}
	/**
	 * 获取：
	 */
	public Date getRegisterdate() {
		return registerdate;
	}
	/**
	 * 设置：
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 获取：
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * 设置：
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * 获取：
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}
	/**
	 * 获取：
	 */
	public String getTelnum() {
		return telnum;
	}
	/**
	 * 设置：
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * 获取：
	 */
	public String getAvatar() {
		return avatar;
	}
	/**
	 * 设置：
	 */
	public void setAssociation(String association) {
		this.association = association;
	}
	/**
	 * 获取：
	 */
	public String getAssociation() {
		return association;
	}
	/**
	 * 设置：部门PK
	 */
	public void setDeptpk(String deptpk) {
		this.deptpk = deptpk;
	}
	/**
	 * 获取：部门PK
	 */
	public String getDeptpk() {
		return deptpk;
	}
	/**
	 * 设置：部门名称
	 */
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	/**
	 * 获取：部门名称
	 */
	public String getDeptname() {
		return deptname;
	}
	/**
	 * 设置：编码
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * 获取：编码
	 */
	public String getUserCode() {
		return userCode;
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
	 * 设置：0: 显示 1:删除
	 */
	public void setDr(Integer dr) {
		this.dr = dr;
	}
	/**
	 * 获取：0: 显示 1:删除
	 */
	public Integer getDr() {
		return dr;
	}
	/**
	 * 设置：岗位、职务pk
	 */
	public void setPostpk(String postpk) {
		this.postpk = postpk;
	}
	/**
	 * 获取：岗位、职务pk
	 */
	public String getPostpk() {
		return postpk;
	}
	/**
	 * 设置：岗位、职务名称
	 */
	public void setPostname(String postname) {
		this.postname = postname;
	}
	/**
	 * 获取：岗位、职务名称
	 */
	public String getPostname() {
		return postname;
	}
	/**
	 * 设置：职级pk
	 */
	public void setRankpk(String rankpk) {
		this.rankpk = rankpk;
	}
	/**
	 * 获取：职级pk
	 */
	public String getRankpk() {
		return rankpk;
	}
	/**
	 * 设置：职级名称
	 */
	public void setRankname(String rankname) {
		this.rankname = rankname;
	}
	/**
	 * 获取：职级名称
	 */
	public String getRankname() {
		return rankname;
	}
	/**
	 * 设置：部门编码
	 */
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	/**
	 * 获取：部门编码
	 */
	public String getDeptcode() {
		return deptcode;
	}
	/**
	 * 设置：人员PK
	 */
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	/**
	 * 获取：人员PK
	 */
	public String getPersonid() {
		return personid;
	}
	/**
	 * 设置：人员名称
	 */
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	/**
	 * 获取：人员名称
	 */
	public String getPersonname() {
		return personname;
	}
	/**
	 * 设置：组织pk
	 */
	public void setOrgpk(String orgpk) {
		this.orgpk = orgpk;
	}
	/**
	 * 获取：组织pk
	 */
	public String getOrgpk() {
		return orgpk;
	}
	/**
	 * 设置：组织名称
	 */
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	/**
	 * 获取：组织名称
	 */
	public String getOrgname() {
		return orgname;
	}
	/**
	 * 设置：财务组织PK
	 */
	public void setFinanceorgid(String financeorgid) {
		this.financeorgid = financeorgid;
	}
	/**
	 * 获取：财务组织PK
	 */
	public String getFinanceorgid() {
		return financeorgid;
	}
	/**
	 * 设置：财务组织名称
	 */
	public void setFinanceorgname(String financeorgname) {
		this.financeorgname = financeorgname;
	}
	/**
	 * 获取：财务组织名称
	 */
	public String getFinanceorgname() {
		return financeorgname;
	}
}
