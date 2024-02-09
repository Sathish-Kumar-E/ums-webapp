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
@Table(name = "COURSE")
public class Course {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COURSE_CATALOG_ID")
	private CourseCatalog courseCatalog;
	
	@Column(name = "CRN")
	private Long crn;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TERM_ID")
	private Term term;
	
	@Column(name = "SEATING_CAPACITY")
	private Long seatingCapacity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROFESSOR_ID")
	private Professor professor;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;
	
	public Course() {
		super();
	}
	
	public Course(CourseCatalog courseCatalog, Long crn, Term term, Long seatingCapacity, Professor professor,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.courseCatalog = courseCatalog;
		this.crn = crn;
		this.term = term;
		this.seatingCapacity = seatingCapacity;
		this.professor = professor;
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
	
	public CourseCatalog getCourseCatalog() {
		return courseCatalog;
	}
	
	public void setCourseCatalog(CourseCatalog courseCatalog) {
		this.courseCatalog = courseCatalog;
	}
	
	public Long getCrn() {
		return crn;
	}
	
	public void setCrn(Long crn) {
		this.crn = crn;
	}
	
	public Term getTerm() {
		return term;
	}
	
	public void setTerm(Term term) {
		this.term = term;
	}
	
	public Long getSeatingCapacity() {
		return seatingCapacity;
	}
	
	public void setSeatingCapacity(Long seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
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
		return "Course [id=" + id + ", courseCatalog=" + courseCatalog + ", crn=" + crn + ", term=" + term
				+ ", seatingCapacity=" + seatingCapacity + ", professor=" + professor + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
