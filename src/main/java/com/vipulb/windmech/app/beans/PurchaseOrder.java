package com.vipulb.windmech.app.beans;

import java.util.Date;

public class PurchaseOrder {

	private int purchaseOrder;
	private String category;
	private String subCategory;
	private String partName;
	private int designNumber;
	private String attachment;
	private char status;
	private double cost;
	private int quantity;
	private int priority;
	private Date orderDate;
	private Date estCompletionDate;
	private Date orderCompletionDate;
	private Date orderIssuedDate;
	private Date orderCancellationDate;
	private String orderCancellationReason;
	private int purchaser;
	private Date lastUpdatedTime;
	private int lastUpdatedBy;
	
	public PurchaseOrder(){
		
	}

	public PurchaseOrder(int purchaseOrder, String category, String subCategory, String partName, int designNumber,
			String attachment, char status, double cost, int quantity, int priority, Date orderDate,
			Date estCompletionDate, Date orderCompletionDate, Date orderIssuedDate, Date orderCancellationDate,
			String orderCancellationReason, int purchaser, Date lastUpdatedTime, int lastUpdatedBy) {
		super();
		this.purchaseOrder = purchaseOrder;
		this.category = category;
		this.subCategory = subCategory;
		this.partName = partName;
		this.designNumber = designNumber;
		this.attachment = attachment;
		this.status = status;
		this.cost = cost;
		this.quantity = quantity;
		this.priority = priority;
		this.orderDate = orderDate;
		this.estCompletionDate = estCompletionDate;
		this.orderCompletionDate = orderCompletionDate;
		this.orderIssuedDate = orderIssuedDate;
		this.orderCancellationDate = orderCancellationDate;
		this.orderCancellationReason = orderCancellationReason;
		this.purchaser = purchaser;
		this.lastUpdatedTime = lastUpdatedTime;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public int getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(int purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getDesignNumber() {
		return designNumber;
	}

	public void setDesignNumber(int designNumber) {
		this.designNumber = designNumber;
	}

	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getEstCompletionDate() {
		return estCompletionDate;
	}

	public void setEstCompletionDate(Date estCompletionDate) {
		this.estCompletionDate = estCompletionDate;
	}

	public Date getOrderCompletionDate() {
		return orderCompletionDate;
	}

	public void setOrderCompletionDate(Date orderCompletionDate) {
		this.orderCompletionDate = orderCompletionDate;
	}

	public Date getOrderIssuedDate() {
		return orderIssuedDate;
	}

	public void setOrderIssuedDate(Date orderIssuedDate) {
		this.orderIssuedDate = orderIssuedDate;
	}

	public Date getOrderCancellationDate() {
		return orderCancellationDate;
	}

	public void setOrderCancellationDate(Date orderCancellationDate) {
		this.orderCancellationDate = orderCancellationDate;
	}

	public String getOrderCancellationReason() {
		return orderCancellationReason;
	}

	public void setOrderCancellationReason(String orderCancellationReason) {
		this.orderCancellationReason = orderCancellationReason;
	}

	public int getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(int purchaser) {
		this.purchaser = purchaser;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	public int getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
	
}
