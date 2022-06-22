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
@Table(name="attendance")
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attendance_id")
	private Long attendanceId;
	private Date date;
	private Date time;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="class_id")
	private Classes classes;

	public Attendance() {
		super();
	}

	public Attendance(Long attendanceId, Date date, Date time, Student student, Classes classes) {
		super();
		this.attendanceId = attendanceId;
		this.date = date;
		this.time = time;
		this.student = student;
		this.classes = classes;
	}

	public Long getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(Long attendanceId) {
		this.attendanceId = attendanceId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	

}
