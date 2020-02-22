package com.bridgelabz.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Student2;

public class Exam2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		 ClassPathXmlApplicationContext context1 =new ClassPathXmlApplicationContext("beans2.xml"); 
		 Student2 stud =context1.getBean("student2",Student2.class);
		 stud.displayStudent();// display the data
		 Student2 stud1 =context1.getBean("kunal",Student2.class); 
		 stud1.displayStudent();// display the data
		 
		/*
		 * Student2 stud = new Student2(1 ,"krunal"); stud.displayStudent();
		 */
	}
}
