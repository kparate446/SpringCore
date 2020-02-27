package com.bridgelabz.AnnotationCollegeInfo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass2 {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig2.class);		

	College2 college = context.getBean("college2",College2.class);//  collegeBean/ColBean
	System.out.println("college object created Spring"+college);
	college.test();
//	((AnnotationConfigApplicationContext)context).close();
	context.close();
	}
}
