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
@Table(name="student_batch")
public class StudentBatch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_batch_id")
	private Long studentBatchId;
	private String batchNo;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public StudentBatch() {
		super();
	}

	public StudentBatch(Long studentBatchId, String batchNo, Student student) {
		super();
		this.studentBatchId = studentBatchId;
		this.batchNo = batchNo;
		this.student = student;
	}

	public Long getStudentBatchId() {
		return studentBatchId;
	}

	public void setStudentBatchId(Long studentBatchId) {
		this.studentBatchId = studentBatchId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
