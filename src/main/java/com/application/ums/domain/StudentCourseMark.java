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
@Table(name = "STUDENT_COURSE_MARK")
public class StudentCourseMark {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_COURSES_ID")
	private Course course;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COURSE_ASSESSMENTS_ID")
	private CourseAssessment courseAssessment;
	
	@Column(name = "OBTAINED_MARKS")
	private Double obtainedMarks;
	
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
	
	public StudentCourseMark() {
		super();
	}
	
	public StudentCourseMark(Course course, CourseAssessment courseAssessment, Double obtainedMarks, String comments,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.course = course;
		this.courseAssessment = courseAssessment;
		this.obtainedMarks = obtainedMarks;
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
	
	public CourseAssessment getCourseAssessment() {
		return courseAssessment;
	}
	
	public void setCourseAssessment(CourseAssessment courseAssessment) {
		this.courseAssessment = courseAssessment;
	}
	
	public Double getObtainedMarks() {
		return obtainedMarks;
	}
	
	public void setObtainedMarks(Double obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
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
		return "StudentCourseMark [id=" + id + ", course=" + course + ", courseAssessment=" + courseAssessment
				+ ", obtainedMarks=" + obtainedMarks + ", comments=" + comments + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
