package com.SchSysAITI.kace.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.SchSysAITI.kace.dao.AssessmentDao;
import com.SchSysAITI.kace.pojo.Assessment;

public abstract class AssessmentServiceImplementation implements AssessmentServiceInterface {

	@Autowired
	private AssessmentDao assessmentDao;
	
	@Override
	public Assessment getAssessment(Assessment assessment) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addAssessment(Assessment assessment) {
		assessmentDao.save(assessment);
		return false;
	}

}
