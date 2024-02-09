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
@Table(name = "USER_MANAGEMENT")
public class UserManagement {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "UNIVERSITY_PERSON_NUMBER")
	private String universityPersonNumber;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "IS_LOCKED")
	private String isLocked;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APPLICATION_ROLE_ID")
	private Role role;
	
	@Column(name = "COMMENTS")
	private String comments;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;
	
	public UserManagement() {
		super();
	}
	
	public UserManagement(String universityPersonNumber, String password, String isLocked, Role role, String comments,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.universityPersonNumber = universityPersonNumber;
		this.password = password;
		this.isLocked = isLocked;
		this.role = role;
		this.comments = comments;
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
	
	public String getUniversityPersonNumber() {
		return universityPersonNumber;
	}
	
	public void setUniversityPersonNumber(String universityPersonNumber) {
		this.universityPersonNumber = universityPersonNumber;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getIsLocked() {
		return isLocked;
	}
	
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
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
		return "UserManagement [id=" + id + ", universityPersonNumber=" + universityPersonNumber + ", password="
				+ password + ", isLocked=" + isLocked + ", role=" + role + ", comments=" + comments + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn
				+ "]";
	}
	
}
