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
public class NodeTravelEntity implements Serializable {
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
	private String fromCity;
	//
	private String toCity;
	//
	private Date travelDate;
	//
	private String travelWay;
	//
	private String note;
	//
	private String filepath;
	//
	private Integer expense;
	//
	private Integer valid;
	//
	private String imagesystemtype;
	//
	private String category;
	//
	private Date ts;
	//
	private String tagContent;
	//费用类型
	private String expensetype;
	//
	private Integer overStandard;
	//
	private String seat;
	//
	private String seatpk;
	//
	private Date startDate;
	//
	private Date endDate;
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
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	/**
	 * 获取：
	 */
	public String getFromCity() {
		return fromCity;
	}
	/**
	 * 设置：
	 */
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	/**
	 * 获取：
	 */
	public String getToCity() {
		return toCity;
	}
	/**
	 * 设置：
	 */
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	/**
	 * 获取：
	 */
	public Date getTravelDate() {
		return travelDate;
	}
	/**
	 * 设置：
	 */
	public void setTravelWay(String travelWay) {
		this.travelWay = travelWay;
	}
	/**
	 * 获取：
	 */
	public String getTravelWay() {
		return travelWay;
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
	 * 设置：费用类型
	 */
	public void setExpensetype(String expensetype) {
		this.expensetype = expensetype;
	}
	/**
	 * 获取：费用类型
	 */
	public String getExpensetype() {
		return expensetype;
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
	public void setSeat(String seat) {
		this.seat = seat;
	}
	/**
	 * 获取：
	 */
	public String getSeat() {
		return seat;
	}
	/**
	 * 设置：
	 */
	public void setSeatpk(String seatpk) {
		this.seatpk = seatpk;
	}
	/**
	 * 获取：
	 */
	public String getSeatpk() {
		return seatpk;
	}
	/**
	 * 设置：
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：
	 */
	public Date getEndDate() {
		return endDate;
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
