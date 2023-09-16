package com.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentEntity.StudentEntity;
import com.StudentService.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public StudentEntity postDetails(@RequestBody StudentEntity studentEn) {
		
		return studentService.saveDetails(studentEn);
	}
	
	
	@GetMapping("/getstudents")
	public List<StudentEntity>getDetails(){
		
		return studentService.getAllDetails();
	}
	
		
}
