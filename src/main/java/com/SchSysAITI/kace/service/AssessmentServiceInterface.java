package com.SchSysAITI.kace.service;

import com.SchSysAITI.kace.pojo.Assessment;


public interface AssessmentServiceInterface {

	//get student grades
	Assessment getAssessment(Assessment assessment); 
	
	//add Assessment
	boolean addAssessment(Assessment assessment);
}
