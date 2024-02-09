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
@Table(name = "PROGRAM_CATALOG")
public class ProgramCatalog {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COLLEGE_ID")
	private College college;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEGREE_TYPE_ID")
	private DegreeType degreeType;
	
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
	
	public ProgramCatalog() {
		super();
	}
	
	public ProgramCatalog(String name, String description, College college, DegreeType degreeType, String comments,
			String isEnabled, String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.name = name;
		this.description = description;
		this.college = college;
		this.degreeType = degreeType;
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public College getCollege() {
		return college;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}
	
	public DegreeType getDegreeType() {
		return degreeType;
	}
	
	public void setDegreeType(DegreeType degreeType) {
		this.degreeType = degreeType;
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
		return "ProgramCatalog [id=" + id + ", name=" + name + ", description=" + description + ", college=" + college
				+ ", degreeType=" + degreeType + ", comments=" + comments + ", isEnabled=" + isEnabled + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ "]";
	}
	
}
