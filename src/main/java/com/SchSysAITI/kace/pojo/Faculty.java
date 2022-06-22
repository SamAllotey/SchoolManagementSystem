package com.SchSysAITI.kace.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "faculty_id")
	private Long facultyId;
	private String employeeCode;
	private String title;
	private String name;
	private String jobTitle;
	private String gender;
	private Date dob;
	private String maritalStatus;
	private String currentAddress;
	private String permanentAddress;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy="faculty")
	private List<AcademicTerm> academicTerm;
	
	@OneToMany(mappedBy="faculty")
	private List<Student> student;
	
	@OneToMany(mappedBy="faculty")
	private List<Classes> classes;

	public Faculty() {
		super();
	}

	public Faculty(Long facultyId, String employeeCode, String title, String name, String jobTitle, String gender,
			Date dob, String maritalStatus, String currentAddress, String permanentAddress, Address address,
			List<AcademicTerm> academicTerm, List<Student> student,
			List<Classes> classes) {
		super();
		this.facultyId = facultyId;
		this.employeeCode = employeeCode;
		this.title = title;
		this.name = name;
		this.jobTitle = jobTitle;
		this.gender = gender;
		this.dob = dob;
		this.maritalStatus = maritalStatus;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
		this.address = address;
		this.academicTerm = academicTerm;
		this.student = student;
		this.classes = classes;
	}

	public Long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<AcademicTerm> getAcademicTerm() {
		return academicTerm;
	}

	public void setAcademicTerm(List<AcademicTerm> academicTerm) {
		this.academicTerm = academicTerm;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}
	
	
}
