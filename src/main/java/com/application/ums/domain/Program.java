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
@Table(name = "PROGRAM")
public class Program {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROGRAM_CATALOG_ID")
	private ProgramCatalog programCatalog;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TERM_ID")
	private Term term;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROGRAM_STATUS_ID")
	private ProgramStatus programStatus;
	
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
	
	public Program() {
		super();
	}
	
	public Program(ProgramCatalog programCatalog, Term term, ProgramStatus programStatus, String comments,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.programCatalog = programCatalog;
		this.term = term;
		this.programStatus = programStatus;
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
	
	public ProgramCatalog getProgramCatalog() {
		return programCatalog;
	}
	
	public void setProgramCatalog(ProgramCatalog programCatalog) {
		this.programCatalog = programCatalog;
	}
	
	public Term getTerm() {
		return term;
	}
	
	public void setTerm(Term term) {
		this.term = term;
	}
	
	public ProgramStatus getProgramStatus() {
		return programStatus;
	}
	
	public void setProgramStatus(ProgramStatus programStatus) {
		this.programStatus = programStatus;
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
		return "Program [id=" + id + ", programCatalog=" + programCatalog + ", term=" + term + ", programStatus="
				+ programStatus + ", comments=" + comments + ", createdBy=" + createdBy + ", createdOn=" + createdOn
				+ ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
