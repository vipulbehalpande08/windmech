package com.vipulb.windmech.app.beans;

import java.util.Date;

public class ClientGroup {

	private int clientGroupId;
	private String groupName;
	private String groupStatus;
	private int clientId;
	private int createdBy;
	private Date createdOn;
	
	public ClientGroup(){
		
	}

	public ClientGroup(int clientGroupId, String groupName, String groupStatus, int clientId, int createdBy,
			Date createdOn) {
		super();
		this.clientGroupId = clientGroupId;
		this.groupName = groupName;
		this.groupStatus = groupStatus;
		this.clientId = clientId;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public int getClientGroupId() {
		return clientGroupId;
	}

	public void setClientGroupId(int clientGroupId) {
		this.clientGroupId = clientGroupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	
}
