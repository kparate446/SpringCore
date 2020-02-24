package com.bridgelabz.commonAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);		

	College college = context.getBean("college",College.class);//  collegeBean/ColBean
	System.out.println("college object created Spring"+college);
	college.test();
}
}
