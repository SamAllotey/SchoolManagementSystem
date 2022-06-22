package com.SchSysAITI.kace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SchSysAITI.kace.dao.AssessmentDao;
import com.SchSysAITI.kace.pojo.Assessment;



@RestController
public class AssessmentController {

	@Autowired
	private AssessmentDao assessmentDao;
	
	//get assessment
		@RequestMapping(value="{assessmentId}", method=RequestMethod.GET)
		public Optional<Assessment> getAssessmentId(@PathVariable Long assessmentId){
			return assessmentDao.findById(assessmentId);
		}
		
		//get list of Assessments
		@GetMapping(value="allAssessments")
		public List<Assessment> getAllAssess(){
			return assessmentDao.findAll();
		}
		
		//delete Assessment
		@DeleteMapping(value="{assessmentId}")
		public void deleteAssessment(@PathVariable Long assessmentId) {
			assessmentDao.deleteById(assessmentId);
		}
		
		//add Assessment
		@PostMapping(value="addAssessment")
		public Assessment addAssessment(@RequestBody Assessment assessment) {
			return assessmentDao.save(assessment);
		}
}
