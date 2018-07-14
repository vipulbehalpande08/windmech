package com.vipulb.windmech.app.beans;

public class Client {

	private int clientId;
	private String clientName;
	private String clientDescription;
	private String address;
	private int zip;
	private char activeFlag;
	
	public Client(){
		
	}
	public Client(int clientId, String clientName, String clientDescription, String address, int zip, char activeFlag) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientDescription = clientDescription;
		this.address = address;
		this.zip = zip;
		this.activeFlag = activeFlag;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientDescription() {
		return clientDescription;
	}
	public void setClientDescription(String clientDescription) {
		this.clientDescription = clientDescription;
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
	public char getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(char activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	
}
