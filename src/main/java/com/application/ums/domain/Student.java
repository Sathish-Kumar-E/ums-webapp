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
@Table(name = "STUDENT")
public class Student {
	
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "UNIVERSITY_STUDENT_NUMBER")
	private String universityStudentNumber;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_STATUS_ID")
	private StudentStatus studentStatus;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "DOB")
	private Date dateOfBirth;
	
	@Column(name = "PASSPORT_NUMBER")
	private String passportNumber;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COLLEGE_ID")
	private College college;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEGREE_CATEGORY_ID")
	private DegreeType degreeType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROGRAM_ID")
	private Program program;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROGRAM_STATUS_ID")
	private ProgramStatus programStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STARTING_TERM_ID")
	private Term startingTerm;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENDING_TERM_ID")
	private Term endingTerm;
	
	@Column(name = "CREATED_BY")
	private String createdBy;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;
	
	@Column(name = "UPDATED_BY")
	private String updatedBy;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;
	
	public Student() {
		super();
	}
	
	public Student(String universityStudentNumber, String firstName, String lastName, StudentStatus studentStatus,
			String email, String phoneNumber, Date dateOfBirth, String passportNumber, College college,
			DegreeType degreeType, Program program, ProgramStatus programStatus, Term startingTerm, Term endingTerm,
			String createdBy, Date createdOn, String updatedBy, Date updatedOn) {
		super();
		this.universityStudentNumber = universityStudentNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentStatus = studentStatus;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.passportNumber = passportNumber;
		this.college = college;
		this.degreeType = degreeType;
		this.program = program;
		this.programStatus = programStatus;
		this.startingTerm = startingTerm;
		this.endingTerm = endingTerm;
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
	
	public String getUniversityStudentNumber() {
		return universityStudentNumber;
	}
	
	public void setUniversityStudentNumber(String universityStudentNumber) {
		this.universityStudentNumber = universityStudentNumber;
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
	
	public StudentStatus getStudentStatus() {
		return studentStatus;
	}
	
	public void setStudentStatus(StudentStatus studentStatus) {
		this.studentStatus = studentStatus;
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
	
	public String getPassportNumber() {
		return passportNumber;
	}
	
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
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
	
	public Program getProgram() {
		return program;
	}
	
	public void setProgram(Program program) {
		this.program = program;
	}
	
	public ProgramStatus getProgramStatus() {
		return programStatus;
	}
	
	public void setProgramStatus(ProgramStatus programStatus) {
		this.programStatus = programStatus;
	}
	
	public Term getStartingTerm() {
		return startingTerm;
	}
	
	public void setStartingTerm(Term startingTerm) {
		this.startingTerm = startingTerm;
	}
	
	public Term getEndingTerm() {
		return endingTerm;
	}
	
	public void setEndingTerm(Term endingTerm) {
		this.endingTerm = endingTerm;
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
		return "Student [id=" + id + ", universityStudentNumber=" + universityStudentNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", studentStatus=" + studentStatus + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", dateOfBirth=" + dateOfBirth + ", passportNumber=" + passportNumber + ", college="
				+ college + ", degreeType=" + degreeType + ", program=" + program + ", programStatus=" + programStatus
				+ ", startingTerm=" + startingTerm + ", endingTerm=" + endingTerm + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + "]";
	}
	
}
