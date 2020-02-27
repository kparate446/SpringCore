package com.bridgelabz.commonAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

		College college = context.getBean("collegeBean", College.class);// collegeBean/ColBean//college
		System.out.println("college object created Spring");
		college.test();
		context.close();
	}
}
