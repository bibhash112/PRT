package com.prt.pojo;

import java.util.Date;

public class releasePojo {

	Date scheduledDate;
	Date dateApproved;
	String appName;
	String snapshot;
	String environmentName;
	String releaseName;
	String status;
	public releasePojo(Date scheduledDate, Date dateApproved, String appName, String snapshot, String environmentName,
			String releaseName, String status) {
		super();
		this.scheduledDate = scheduledDate;
		this.dateApproved = dateApproved;
		this.appName = appName;
		this.snapshot = snapshot;
		this.environmentName = environmentName;
		this.releaseName = releaseName;
		this.status = status;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public Date getDateApproved() {
		return dateApproved;
	}
	public void setDateApproved(Date dateApproved) {
		this.dateApproved = dateApproved;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getSnapshot() {
		return snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}
	public String getEnvironmentName() {
		return environmentName;
	}
	public void setEnvironmentName(String environmentName) {
		this.environmentName = environmentName;
	}
	public String getReleaseName() {
		return releaseName;
	}
	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
