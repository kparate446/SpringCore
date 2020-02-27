package com.bridgelabz.loadingPropertiesFile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans9.xml");

	Student student = context.getBean("student",Student.class);
	System.out.println("student"+student.toString());
	student.displayStudentInfo();
	context.close();
}
}
