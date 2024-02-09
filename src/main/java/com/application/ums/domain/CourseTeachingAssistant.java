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
@Table(name = "COURSE_TEACHING_ASSISTANT")
public class CourseTeachingAssistant {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COURSE_ID")
	private Course course;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	
	@Column(name = "START_DATE")
	private Date startDate;
	
	@Column(name = "END_DATE")
	private Date endDate;
	
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
	
	public CourseTeachingAssistant() {
		super();
	}
	
	public CourseTeachingAssistant(Course course, Student student, Date startDate, Date endDate,
			EmploymentType employmentType, EmploymentDesignation employmentDesignation,
			EmploymentStatus employmentStatus, String comments, String createdBy, Date createdOn, String updatedBy,
			Date updatedOn) {
		super();
		this.course = course;
		this.student = student;
		this.startDate = startDate;
		this.endDate = endDate;
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
	
	public Course getCourse() {
		return course;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		return "CourseTeachingAssistant [id=" + id + ", course=" + course + ", student=" + student + ", startDate="
				+ startDate + ", endDate=" + endDate + ", employmentType=" + employmentType + ", employmentDesignation="
				+ employmentDesignation + ", employmentStatus=" + employmentStatus + ", comments=" + comments
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn="
				+ updatedOn + "]";
	}
	
}
