package com.SchSysAITI.kace.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="academic_term")
public class AcademicTerm {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "academicTerm_id")
	private Long termId;
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;

	public AcademicTerm() {
		super();
	}

	public AcademicTerm(Long termId, Date startDate, Date endDate, Faculty faculty, Course course) {
		super();
		this.termId = termId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.faculty = faculty;
		this.course = course;
	}

	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
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

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
