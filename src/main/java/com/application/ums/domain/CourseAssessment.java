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
@Table(name = "COURSE_ASSESSMENT")
public class CourseAssessment {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COURSE_ID")
	private Course course;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "WEIGHTAGE")
	private Double weightage;
	
	@Column(name = "TOTAL_MARKS")
	private Double totalMarks;
	
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
	
	public CourseAssessment() {
		super();
	}
	
	public CourseAssessment(Course course, String name, Double weightage, Double totalMarks, String comments,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.course = course;
		this.name = name;
		this.weightage = weightage;
		this.totalMarks = totalMarks;
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getWeightage() {
		return weightage;
	}
	
	public void setWeightage(Double weightage) {
		this.weightage = weightage;
	}
	
	public Double getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(Double totalMarks) {
		this.totalMarks = totalMarks;
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
		return "CourseAssessment [id=" + id + ", course=" + course + ", name=" + name + ", weightage=" + weightage
				+ ", totalMarks=" + totalMarks + ", comments=" + comments + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
