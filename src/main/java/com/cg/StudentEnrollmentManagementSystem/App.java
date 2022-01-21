package com.cg.StudentEnrollmentManagementSystem;

import java.util.Scanner;


import com.cg.StudentEnrollmentManagementSystem.entities.Student;
import com.cg.StudentEnrollmentManagementSystem.service.IStudentService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        String name,contact,password,coursename,status1;
        
        System.out.println("********************************************************");
        System.out.println( "WELCOME TO THE STUDENT ENROLLMENT MANAGEMENT SYSTEM" );
        System.out.println("********************************************************");
        System.out.println("If you are already Enrolled press 1 to login else press 2 for register and enroll: ");
        Scanner scanner=new Scanner(System.in);
        Student student1=new Student();
        int ch=scanner.nextInt();
        IStudentService iStudentService=new IStudentService();
        switch(ch)
        {
        case 1 : System.out.println("---------------------");
        	     System.out.println("Welcome to login : ");
        	     System.out.println("---------------------");
        		 System.out.println("Enter your Name : ");
        		 scanner.nextLine();
        		  name=scanner.nextLine();
        		 System.out.println("Enter your password : ");
        		  password=scanner.nextLine();
        		  try
        		  {
        			  student1=iStudentService.getStudentLogin(name, password);
        			  if(student1.getStudentName().equals(name) && student1.getPassword().equals(password))
            		  {
            			  System.out.println("Welcome "+student1.getStudentName()+"!!");
            		  }
            		  else
            		  {
            			  System.out.println("Invalid credentials!...Please check and Login again!!");
            		  }
        		  }
        		  catch(Exception e)
        		  {
        			 
        			  
        			  System.out.println("Invalid credentials..Please check and login again!!");
        		  }
        			  
        		break;
        
        case 2: System.out.println("---------------------------------------------------");
        	    System.out.println("Please register yourself to enroll a course : ");
        	    System.out.println("---------------------------------------------------");
        		System.out.println("Enter your name : ");
        		scanner.nextLine();
        		name=scanner.nextLine();
        		System.out.println("Enter your password : ");
        		password=scanner.nextLine();
        		System.out.println("Enter your contact : ");
        		contact=scanner.nextLine();
        		 System.out.println("********************************************************");
        		System.out.println("The available courses are:  \n  IOT \n  Data Science \n  Cloud Computing \n  Cybersecurity");
        		 System.out.println("********************************************************");
        		System.out.println("Enter the course name you want to enroll : ");
        		coursename=scanner.nextLine();
        		
        		Student student=new Student();
        		student.setStudentName(name);
        		student.setStudentContact(contact);
        		student.setPassword(password);
        		
        		
        		
        		status1=iStudentService.Enroll(student);
        		
        		
        		if(status1.equalsIgnoreCase("success") )
        		{
        			 System.out.println("********************************************************");
        			System.out.println("Enrollment is successful!!");
        			 System.out.println("********************************************************");
        		
        		}
        		else
        		{
        			
        			System.out.println("Oops!! Enrollment is unsuccessful!!");
        			
        		}
        		
        		
        }
        scanner.close();
    }
    }

