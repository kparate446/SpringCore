package com.bridgelabz.springAOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);//ClassPathXmlApplicationContext("AppConfig.java");
		Student s1 = context.getBean(Student.class);
		s1.show();
		((AbstractApplicationContext) context).close();
	}
}
