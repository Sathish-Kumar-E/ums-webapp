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
@Table(name = "PROFESSOR")
public class Professor {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "UNIVERSITY_PROFESSOR_NUMBER")
	private String universityProfessorNumber;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "DOB")
	private Date dateOfBirth;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COLLEGE_ID")
	private College college;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYMENT_TYPE_ID")
	private EmploymentType employmentType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYMENT_DESIGNATION_ID")
	private EmploymentDesignation employmentDesignation;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYMENT_STATUS_ID")
	private EmploymentStatus employmentStatus;
	
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
	
	public Professor() {
		super();
	}
	
	public Professor(String universityProfessorNumber, String firstName, String lastName, String email,
			String phoneNumber, Date dateOfBirth, College college, EmploymentType employmentType,
			EmploymentDesignation employmentDesignation, EmploymentStatus employmentStatus, String comments,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.universityProfessorNumber = universityProfessorNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.college = college;
		this.employmentType = employmentType;
		this.employmentDesignation = employmentDesignation;
		this.employmentStatus = employmentStatus;
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
	
	public String getUniversityProfessorNumber() {
		return universityProfessorNumber;
	}
	
	public void setUniversityProfessorNumber(String universityProfessorNumber) {
		this.universityProfessorNumber = universityProfessorNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public College getCollege() {
		return college;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}
	
	public EmploymentType getEmploymentType() {
		return employmentType;
	}
	
	public void setEmploymentType(EmploymentType employmentType) {
		this.employmentType = employmentType;
	}
	
	public EmploymentDesignation getEmploymentDesignation() {
		return employmentDesignation;
	}
	
	public void setEmploymentDesignation(EmploymentDesignation employmentDesignation) {
		this.employmentDesignation = employmentDesignation;
	}
	
	public EmploymentStatus getEmploymentStatus() {
		return employmentStatus;
	}
	
	public void setEmploymentStatus(EmploymentStatus employmentStatus) {
		this.employmentStatus = employmentStatus;
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
		return "Professor [id=" + id + ", universityProfessorNumber=" + universityProfessorNumber + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", dateOfBirth=" + dateOfBirth + ", college=" + college + ", employmentType=" + employmentType
				+ ", employmentDesignation=" + employmentDesignation + ", employmentStatus=" + employmentStatus
				+ ", comments=" + comments + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy="
				+ updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
