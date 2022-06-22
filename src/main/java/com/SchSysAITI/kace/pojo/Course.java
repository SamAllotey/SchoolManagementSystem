package com.SchSysAITI.kace.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "course_id")
	private Long courseId;
	@Column(name = "course_code")
	private String courseCode;
	@Column(name = "course_name")
	private String courseName;
	@Column(name = "course_description")
	private String courseDescription;
	
	@OneToMany(mappedBy="course")
	private List<AcademicTerm> academicTerm;
	
	@OneToMany(mappedBy="course")
	private List<Student> student;
	
	@OneToMany(mappedBy="course")
	private List<Subject> subject;

	public Course() {
		super();
	}

	public Course(Long courseId, String courseCode, String courseName, String courseDescription,
			List<AcademicTerm> academicTerm, List<Student> student, List<Subject> subject) {
		super();
		this.courseId = courseId;
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.academicTerm = academicTerm;
		this.student = student;
		this.subject = subject;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
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

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
}
