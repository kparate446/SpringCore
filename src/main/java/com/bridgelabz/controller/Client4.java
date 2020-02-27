package com.bridgelabz.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Student4;
// Spring Loose Coupling
public class Client4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		System.out.println("Xml file Loaded");
		//1st Object is Created
		Student4 student4 = context.getBean("stud",Student4.class);
		student4.paper() ;
	}
}
