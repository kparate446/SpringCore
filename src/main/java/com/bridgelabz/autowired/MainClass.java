package com.bridgelabz.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");

	Human human = context.getBean("human",Human.class);
	human.startPumping();
	
}
}
