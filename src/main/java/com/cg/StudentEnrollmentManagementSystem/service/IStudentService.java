package com.cg.StudentEnrollmentManagementSystem.service;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.StudentEnrollmentManagementSystem.entities.Student;
import com.cg.StudentEnrollmentManagementSystem.repository.IStudent;


public class IStudentService implements IStudent {

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentLogin(String studentname, String password) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentInfo");
		EntityManager em=emf.createEntityManager();
		Student student=new Student();
		try
		{
			 student=(Student)em.createQuery("from User where userName='"+studentname+"' and userPassword='"+password+"'").getSingleResult();	
		
		if(student!=null)
		{
			em.close();
			return student;
		}
		else
		{
			em.close();
			
		}
		}
		catch(Exception e)
		{
			System.out.println("Please Try Again");
		}
		
		return student;
		
	}

	@Override
	public String Enroll(Student student) {
		
		try
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentInfo");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(student);
			et.commit();
			em.close();
			return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "fail";
		
	}

	
		
	}


