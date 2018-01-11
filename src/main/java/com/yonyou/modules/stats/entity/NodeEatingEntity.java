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
public class NodeEatingEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String pk;
	//
	private String userId;
	//
	private Double money;
	//
	private String company;
	//
	private Integer personNum;
	//
	private Date eatingDate;
	//
	private String filepath;
	//
	private String note;
	//
	private String tagContent;
	//
	private Integer valid;
	//
	private String category;
	//
	private Integer expense;
	//
	private String imagesystemtype;
	//
	private Date ts;
	//
	private Integer overStandard;
	//
	private String itemPk;
	//
	private String itemName;
	//
	private String szitemPk;
	//
	private String szitemName;
	//
	private Double reductionAmount;
	//
	private String reductionInfo;
	//
	private Date reductionTime;

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
	public void setPersonNum(Integer personNum) {
		this.personNum = personNum;
	}
	/**
	 * 获取：
	 */
	public Integer getPersonNum() {
		return personNum;
	}
	/**
	 * 设置：
	 */
	public void setEatingDate(Date eatingDate) {
		this.eatingDate = eatingDate;
	}
	/**
	 * 获取：
	 */
	public Date getEatingDate() {
		return eatingDate;
	}
	/**
	 * 设置：
	 */
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	/**
	 * 获取：
	 */
	public String getFilepath() {
		return filepath;
	}
	/**
	 * 设置：
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * 获取：
	 */
	public String getNote() {
		return note;
	}
	/**
	 * 设置：
	 */
	public void setTagContent(String tagContent) {
		this.tagContent = tagContent;
	}
	/**
	 * 获取：
	 */
	public String getTagContent() {
		return tagContent;
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
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * 获取：
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * 设置：
	 */
	public void setExpense(Integer expense) {
		this.expense = expense;
	}
	/**
	 * 获取：
	 */
	public Integer getExpense() {
		return expense;
	}
	/**
	 * 设置：
	 */
	public void setImagesystemtype(String imagesystemtype) {
		this.imagesystemtype = imagesystemtype;
	}
	/**
	 * 获取：
	 */
	public String getImagesystemtype() {
		return imagesystemtype;
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
	public void setItemPk(String itemPk) {
		this.itemPk = itemPk;
	}
	/**
	 * 获取：
	 */
	public String getItemPk() {
		return itemPk;
	}
	/**
	 * 设置：
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * 获取：
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * 设置：
	 */
	public void setSzitemPk(String szitemPk) {
		this.szitemPk = szitemPk;
	}
	/**
	 * 获取：
	 */
	public String getSzitemPk() {
		return szitemPk;
	}
	/**
	 * 设置：
	 */
	public void setSzitemName(String szitemName) {
		this.szitemName = szitemName;
	}
	/**
	 * 获取：
	 */
	public String getSzitemName() {
		return szitemName;
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
	public void setReductionInfo(String reductionInfo) {
		this.reductionInfo = reductionInfo;
	}
	/**
	 * 获取：
	 */
	public String getReductionInfo() {
		return reductionInfo;
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
}
