package com.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentEntity.StudentEntity;

public interface StudentRepo extends JpaRepository <StudentEntity,Integer>{

}
