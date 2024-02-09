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
@Table(name = "COURSE_CATALOG")
public class CourseCatalog {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "COURSE_CODE")
	private String courseCode;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "CREDITS")
	private Long credits;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROGRAM_CATALOG_ID")
	private ProgramCatalog programCatalog;
	
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
	
	@Column(name = "UPDATED_BY")
	private Date updatedOn;
	
	public CourseCatalog() {
		super();
	}
	
	public CourseCatalog(String courseCode, String courseName, String description, Long credits,
			ProgramCatalog programCatalog, String comments, String isEnabled, String createdBy, Date createdOn,
			String updatedBy, Date updatedOn) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.description = description;
		this.credits = credits;
		this.programCatalog = programCatalog;
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
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Long getCredits() {
		return credits;
	}
	
	public void setCredits(Long credits) {
		this.credits = credits;
	}
	
	public ProgramCatalog getProgramCatalog() {
		return programCatalog;
	}
	
	public void setProgramCatalog(ProgramCatalog programCatalog) {
		this.programCatalog = programCatalog;
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
		return "CourseCatalog [id=" + id + ", courseCode=" + courseCode + ", courseName=" + courseName
				+ ", description=" + description + ", credits=" + credits + ", programCatalog=" + programCatalog
				+ ", comments=" + comments + ", isEnabled=" + isEnabled + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
