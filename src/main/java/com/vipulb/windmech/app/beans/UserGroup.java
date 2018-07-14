package com.vipulb.windmech.app.beans;

public class UserGroup {

	private int userGroupId;
	private int clientGroupId;
	private int userId;
	
	public UserGroup(){
		
	}

	public UserGroup(int userGroupId, int clientGroupId, int userId) {
		super();
		this.userGroupId = userGroupId;
		this.clientGroupId = clientGroupId;
		this.userId = userId;
	}

	public int getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(int userGroupId) {
		this.userGroupId = userGroupId;
	}

	public int getClientGroupId() {
		return clientGroupId;
	}

	public void setClientGroupId(int clientGroupId) {
		this.clientGroupId = clientGroupId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
