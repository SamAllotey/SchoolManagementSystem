package com.SchSysAITI.kace.pojo;

import java.util.List;

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
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subject_id")
	private Long subjectId;
	private String subjectCode;
	private String subjectName;
	private String subjectDescription;
	
	@OneToMany(mappedBy = "subject")
	private List<Assessment> assessment;
	
	@OneToMany(mappedBy = "subject")
	private List<Classes> classes;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	private Course course;
}
