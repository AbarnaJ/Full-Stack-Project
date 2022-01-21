package com.cg.StudentEnrollmentManagementSystem.repository;


import com.cg.StudentEnrollmentManagementSystem.entities.Student;

public interface IStudent {

Student getStudentByName(String name);
	
	Student getStudentLogin(String studentname,String password);
	
	String Enroll(Student student);
	

}
