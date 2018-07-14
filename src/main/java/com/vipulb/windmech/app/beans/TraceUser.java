package com.vipulb.windmech.app.beans;



public class TraceUser {

	private String userId;
	private String username;
	private int clientId;
	private String email;
	private String password;
	private String activeFlag;
	
	public TraceUser(){
		
	}

	public TraceUser(String userId, String username,int clientId, String email, String password, String activeFlag) {
		super();
		this.userId = userId;
		this.username = username;
		this.clientId = clientId;
		this.email = email;
		this.password = password;
		this.activeFlag = activeFlag;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	
}
