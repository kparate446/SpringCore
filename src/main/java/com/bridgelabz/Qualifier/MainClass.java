package com.bridgelabz.Qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans8.xml");

	Human human = context.getBean("human",Human.class);
	human.startPumping();
	
}
}
