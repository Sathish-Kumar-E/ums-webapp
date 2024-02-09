package com.application.ums.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "STUDENT_STATUS")
public class StudentStatus {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "STATUS_NAME")
	private String statusName;
	
	@Column(name = "IS_ENABLED")
	private String isEnabled;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED ON")
	private Date createdOn;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;

	public StudentStatus() {
		super();
	}

	public StudentStatus(String statusName, String isEnabled, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		this.statusName = statusName;
		this.isEnabled = isEnabled;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "StudentStatus [Id=" + id + ", statusName=" + statusName + ", isEnabled=" + isEnabled + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ "]";
	}
	
}
