package com.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentEntity.StudentEntity;
import com.StudentRepo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public StudentEntity saveDetails(StudentEntity studentEn) {
		
		return studentRepo.save(studentEn);
	}
	

	public List<StudentEntity> getAllDetails(){
		
		return studentRepo.findAll();
	}
}
