package com.SchSysAITI.kace.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.SchSysAITI.kace.dao.StudentDao;
import com.SchSysAITI.kace.pojo.Student;

@Service
public class StudentServiceImplementation implements StudentServiceInterface {

	@Autowired
	private StudentDao studentDao;
	

	@Override
	public Student studentAuthentication(Student student) {
		Student stud = new Student();
		stud.setPrn(student.getPrn());
		stud.setPassword(student.getPassword());
		
		Example<Student> studExample = Example.of(stud);
		Optional<Student> option = studentDao.findOne(studExample);
		
		if(option.isPresent()) {
			return option.get();
		}
		
		return null;
	}

	@Override
	public boolean studentRegistration(Student student) {
		studentDao.save(student);
		return true;
	}

	@Override
	public Student getStudentProfile(Student student) {
		Student stud = new Student();
		stud.setStudentId(stud.getStudentId());
		
		//Example interface
		Example<Student> studExample = Example.of(stud);
		Optional<Student> option = studentDao.findOne(studExample);

		if(option.isPresent()) {
			return option.get();
		}	
		return null;
	}

	@Override
	public Student changePassword(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void updateStudent(Long studentId, Student student) {
	     studentDao.save(student);
	}

//	@Override
//	public Student changePassword(Student student) {
//		Student stud = new Student();
//		stud.setPassword(stud.getPassword());
//		
//		//Example interface
//		Example<Student> studExample = Example.of(stud);
//		Optional<Student> option = studentDao.save(studExample);
//
//		if(option.isPresent()) {
//			return option.get();
//		}	
//		return null;
//	}

}
