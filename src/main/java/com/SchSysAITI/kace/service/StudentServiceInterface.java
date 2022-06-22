package com.SchSysAITI.kace.service;


import com.SchSysAITI.kace.pojo.Student;

public interface StudentServiceInterface {

	    //check student authentication
		Student studentAuthentication(Student student);
		
		//check if student is registered
		boolean studentRegistration(Student student);
		
		Student getStudentProfile(Student student);
		
		Student changePassword(Student student);
		
		Student updateStudent(Student student);		
}
