package com.bridgelabz.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");

	Human human = context.getBean("human",Human.class);
	human.startPumping();
	
}
}
