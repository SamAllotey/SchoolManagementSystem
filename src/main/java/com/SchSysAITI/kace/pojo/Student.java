package com.SchSysAITI.kace.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private Long studentId;
	private int formNo;
	private int prn;
	private String title;
	private String name;
	private String password;
	private String gender;
	private Date dob;
	private String maritalStatus;
	private Date registrationDate;
	private boolean registrationStatus;
	
	@Embedded
	private StudentContactDetails studentContactDetails;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy="student")
	private List<Attendance> attendance;
	
	@OneToMany(mappedBy="student")
	private List<Assessment> assessment;
	
	@OneToMany(mappedBy="student")
	private List<StudentBatch> studentBatch;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;

	public Student() {
		super();
	}

	public Student(Long studentId, int formNo, int prn, String title, String name, String password, String gender,
			Date dob, String maritalStatus, Date registrationDate, boolean registrationStatus,
			StudentContactDetails studentContactDetails, Address address, List<Attendance> attendance,
			List<Assessment> assessment, List<StudentBatch> studentBatch, Course course, Faculty faculty) {
		super();
		this.studentId = studentId;
		this.formNo = formNo;
		this.prn = prn;
		this.title = title;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.maritalStatus = maritalStatus;
		this.registrationDate = registrationDate;
		this.registrationStatus = registrationStatus;
		this.studentContactDetails = studentContactDetails;
		this.address = address;
		this.attendance = attendance;
		this.assessment = assessment;
		this.studentBatch = studentBatch;
		this.course = course;
		this.faculty = faculty;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public int getFormNo() {
		return formNo;
	}

	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public boolean isRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(boolean registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public StudentContactDetails getStudentContactDetails() {
		return studentContactDetails;
	}

	public void setStudentContactDetails(StudentContactDetails studentContactDetails) {
		this.studentContactDetails = studentContactDetails;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}

	public List<Assessment> getAssessment() {
		return assessment;
	}

	public void setAssessment(List<Assessment> assessment) {
		this.assessment = assessment;
	}

	public List<StudentBatch> getStudentBatch() {
		return studentBatch;
	}

	public void setStudentBatch(List<StudentBatch> studentBatch) {
		this.studentBatch = studentBatch;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	
}
