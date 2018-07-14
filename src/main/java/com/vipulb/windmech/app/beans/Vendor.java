package com.vipulb.windmech.app.beans;

import java.io.Serializable;


public class Vendor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int vendorId;
	
	private String vendorName;
	//private int ownerId;
	private String contact;
	private String address;
	private int zip;
	
	public Vendor(){
		
	}

	public Vendor(int vendorId, String vendorName,  String contact, String address, int zip) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
//		this.ownerId = ownerId;
		this.contact = contact;
		this.address = address;
		this.zip = zip;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

/*	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
*/
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	
}
