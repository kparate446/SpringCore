package com.bridgelabz.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Student1;

public class Exam1 {
	public static void main(String[] args) {
//		Student1 student1 = new Student1();
////		student1.StudentName =" Krunal";
//		student1.setStudentName(" Krunal Parate");
//		student1.displayStudent();
		// Calling the bean1 property
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		Student1 stud = context.getBean("student",Student1.class);
		stud.displayStudent();// display the data
	
		Student1 ankit = context.getBean("ankit" , Student1.class);// Dependency Injection 
		ankit.displayStudent();
	}
}  
