package com.cg.StudentEnrollmentManagementSystem.serviceTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cg.StudentEnrollmentManagementSystem.entities.Student;
import com.cg.StudentEnrollmentManagementSystem.service.IStudentService;

public class StudentServiceTest {
	@Test
	public void registerTest()
	{
		IStudentService iStudentService=new IStudentService ();
		Student student=new Student();
		student.setStudentName("Sample");
		student.setPassword("sample@1234");
		student.setStudentContact("1234567890");
		String status=iStudentService.Enroll(student);
		assertEquals("success",status);
		
	}

}
