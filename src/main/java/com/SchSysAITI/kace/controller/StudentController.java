package com.SchSysAITI.kace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SchSysAITI.kace.dao.StudentDao;
import com.SchSysAITI.kace.pojo.Student;
import com.SchSysAITI.kace.service.StudentServiceImplementation;


@RestController
public class StudentController {

	@Autowired
	private StudentServiceImplementation studentService;
	
	@Autowired
	private StudentDao studentDao;
	
	//get a student
	@RequestMapping(value="{studentId}", method=RequestMethod.GET)
	public Optional<Student> getStudentId(@PathVariable Long studentId){
		return studentDao.findById(studentId);
	}
	
	//get list of all students
	@GetMapping(value="allStudents")
	public List<Student> getAllStudents(){
		return studentDao.findAll();
	}
	
	//delete a student
	@DeleteMapping(value="{studentId}")
	public void deleteStudent(@PathVariable Long studentId) {
		studentDao.deleteById(studentId);
	}
	
	//add a Student
	@PostMapping(value="addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentDao.save(student);
	}
	
	//update a Student
	@RequestMapping(value = "{studentId}", method = RequestMethod.PUT)
	 public Optional<Student> updateStudent(@PathVariable Long studentId) {
		return studentDao.save(studentId);
	 }
	
	
	//Authenticate student
	@RequestMapping(value="studauthentication", method=RequestMethod.POST)
	public ResponseEntity<?> stdEntity(@RequestBody Student student){   //@RequestBody converts the object to JSON
		Student std = studentService.studentAuthentication(student);
		
		if(std != null) {
			return new ResponseEntity<Student>(std, HttpStatus.OK);
		}
		return new ResponseEntity<String>("Cannot authenticate student", HttpStatus.OK);
	}
	
	//Register student
	@RequestMapping(value="studregistration", method=RequestMethod.POST)
	public ResponseEntity<?> studentReg(@RequestBody Student student){
		studentService.studentRegistration(student);
		
		return new ResponseEntity<String>("Student saved", HttpStatus.OK);
	}
	
}
