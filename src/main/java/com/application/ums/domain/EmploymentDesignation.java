package com.application.ums.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "EMPLOYMENT_DESIGNATION")
public class EmploymentDesignation {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYMENT_GRADE_ID")
	private EmploymentGrade employmentGrade;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "COMMENTS")
	private String comments;
	
	@Column(name = "IS_ENABLED")
	private String isEnabled;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;
	
	public EmploymentDesignation() {
		super();
	}
	
	public EmploymentDesignation(String name, EmploymentGrade employmentGrade, String description, String comments,
			String isEnabled, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.name = name;
		this.employmentGrade = employmentGrade;
		this.description = description;
		this.comments = comments;
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EmploymentGrade getEmploymentGrade() {
		return employmentGrade;
	}
	
	public void setEmploymentGrade(EmploymentGrade employmentGrade) {
		this.employmentGrade = employmentGrade;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
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
		return "EmploymentDesignation [id=" + id + ", name=" + name + ", employmentGrade=" + employmentGrade
				+ ", description=" + description + ", comments=" + comments + ", isEnabled=" + isEnabled
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn="
				+ updatedOn + "]";
	}
	
}
