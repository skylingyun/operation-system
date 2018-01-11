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
public class NodeHotelEntity implements Serializable {
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
	private String city;
	//
	private Date startDate;
	//
	private Date endDate;
	//
	private String hotel;
	//
	private String note;
	//
	private String filepath;
	//
	private Integer expense;
	//
	private Integer valid;
	//
	private String category;
	//
	private Date ts;
	//
	private String tagContent;
	//税率
	private Double taxrate;
	//税额
	private Double includtax;
	//无税金额
	private Double nottax;
	//发票号
	private String invoicenum;
	//预留字段
	private String demo1;
	//
	private String imagesystemtype;
	//
	private Integer overStandard;
	//
	private String citypk;
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
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：
	 */
	public String getCity() {
		return city;
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
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	/**
	 * 获取：
	 */
	public String getHotel() {
		return hotel;
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
	 * 设置：税率
	 */
	public void setTaxrate(Double taxrate) {
		this.taxrate = taxrate;
	}
	/**
	 * 获取：税率
	 */
	public Double getTaxrate() {
		return taxrate;
	}
	/**
	 * 设置：税额
	 */
	public void setIncludtax(Double includtax) {
		this.includtax = includtax;
	}
	/**
	 * 获取：税额
	 */
	public Double getIncludtax() {
		return includtax;
	}
	/**
	 * 设置：无税金额
	 */
	public void setNottax(Double nottax) {
		this.nottax = nottax;
	}
	/**
	 * 获取：无税金额
	 */
	public Double getNottax() {
		return nottax;
	}
	/**
	 * 设置：发票号
	 */
	public void setInvoicenum(String invoicenum) {
		this.invoicenum = invoicenum;
	}
	/**
	 * 获取：发票号
	 */
	public String getInvoicenum() {
		return invoicenum;
	}
	/**
	 * 设置：预留字段
	 */
	public void setDemo1(String demo1) {
		this.demo1 = demo1;
	}
	/**
	 * 获取：预留字段
	 */
	public String getDemo1() {
		return demo1;
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
	public void setCitypk(String citypk) {
		this.citypk = citypk;
	}
	/**
	 * 获取：
	 */
	public String getCitypk() {
		return citypk;
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
