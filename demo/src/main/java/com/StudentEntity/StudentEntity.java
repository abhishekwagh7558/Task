package com.StudentEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Student_DB")
public class StudentEntity {


	
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    @Column(name="ID")
		    private int id;
		    
		    @Column(name="Stu_Name")
		    private String firstName;
		    
		    @Column(name="Stu_Marks")
		    private int marks;

		    // Constructors, getters, and setters
		}


	

