package com.bridgelabz.controller;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.AnotherStudent3;
import com.bridgelabz.model.Student3;
// Spring Constructor Injection
public class Client3 {
	public static void main(String[] args) {
		/*
		 * Student3 student3 = new Student3(); 
		 * Math3 math = new Math3();
		 * student3.setMath(math);
		 *  student3.paper();
		 */		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		System.out.println("Xml file Loaded");
		//1st Object is Created
		Student3 student3 = context.getBean("stud",Student3.class);
		student3.paper() ;
		// 2nd Object is Created
		AnotherStudent3 student = context.getBean("anotherStudent",AnotherStudent3.class);
		System.out.println("loaded the another Student object");
		student.startPaper();
		// Object is Created in One time 
	
	}
}
