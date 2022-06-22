package com.SchSysAITI.kace.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="assessment")
public class Assessment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "assessment_id")
	private Long assessmentId;
	private String assessmentType;
	private int mark;
	private int visible;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject subject;

	public Assessment() {
		super();
	}

	public Assessment(Long assessmentId, String assessmentType, int mark, int visible, Student student,
			Subject subject) {
		super();
		this.assessmentId = assessmentId;
		this.assessmentType = assessmentType;
		this.mark = mark;
		this.visible = visible;
		this.student = student;
		this.subject = subject;
	}

	public Long getAssessmentId() {
		return assessmentId;
	}

	public void setAssessmentId(Long assessmentId) {
		this.assessmentId = assessmentId;
	}

	public String getAssessmentType() {
		return assessmentType;
	}

	public void setAssessmentType(String assessmentType) {
		this.assessmentType = assessmentType;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getVisible() {
		return visible;
	}

	public void setVisible(int visible) {
		this.visible = visible;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
}
