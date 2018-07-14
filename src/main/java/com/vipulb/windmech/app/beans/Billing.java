package com.vipulb.windmech.app.beans;

import java.util.Date;

public class Billing {

	private int billNumber;
	private int purchaseOrder;
	private double totalAmount;
	private Date generatedOn;
	
	public Billing(){
		
	}

	public Billing(int billNumber, int purchaseOrder, double totalAmount, Date generatedOn) {
		super();
		this.billNumber = billNumber;
		this.purchaseOrder = purchaseOrder;
		this.totalAmount = totalAmount;
		this.generatedOn = generatedOn;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public int getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(int purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getGeneratedOn() {
		return generatedOn;
	}

	public void setGeneratedOn(Date generatedOn) {
		this.generatedOn = generatedOn;
	}
	
	
}
