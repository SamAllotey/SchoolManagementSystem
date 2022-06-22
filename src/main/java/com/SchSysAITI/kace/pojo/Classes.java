package com.SchSysAITI.kace.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classroom")
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "class_id")
	private Long classId;
	@Column(name = "class_date")
	private Date classDate;
	@Column(name = "class_location")
	private String classLocation;
	private Date startTime;
	private Date endTime;
	@Column(name = "class_type")
	private String classType;
	
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	@OneToMany(mappedBy="classes", cascade=CascadeType.ALL)
	private List<Attendance> attendance;

	public Classes() {
		super();
	}

	public Classes(Long classId, Date classDate, String classLocation, Date startTime, Date endTime, String classType,
			Subject subject, Faculty faculty, List<Attendance> attendance) {
		super();
		this.classId = classId;
		this.classDate = classDate;
		this.classLocation = classLocation;
		this.startTime = startTime;
		this.endTime = endTime;
		this.classType = classType;
		this.subject = subject;
		this.faculty = faculty;
		this.attendance = attendance;
	}
	
	
}
