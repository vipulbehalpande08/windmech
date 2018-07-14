package com.vipulb.windmech.app.beans;

import java.util.Date;

public class Service {

	private int serviceId;
	private String serviceName;
	private int vendorId;
	private double cost;
	private Date lastUpdatedTime;
	private int lastUpdatedBy;
	
	public Service(){
		
	}

	public Service(int serviceId, String serviceName, int vendorId, double cost, Date lastUpdatedTime,
			int lastUpdatedBy) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.vendorId = vendorId;
		this.cost = cost;
		this.lastUpdatedTime = lastUpdatedTime;
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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
