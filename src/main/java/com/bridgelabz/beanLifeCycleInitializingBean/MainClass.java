package com.bridgelabz.beanLifeCycleInitializingBean;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Scanner sc = new Scanner(System.in);
//	StudentConnection connection = new StudentConnection();
//	connection.selectAllRows();
////	System.out.println("deleted the record");
////	int Sid = sc.nextInt();
//	connection.deleteStudentRecord(3);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans13.xml");
//		context.registerShutdownHook();
//		StudentConnection connection = context.getBean("studentConnection",StudentConnection.class);
//		connection.selectAllRows();
//		context.close();
//		context.registerShutdownHook();
		
		/** After call the method 
		 * 1)context.close() --> Exception is occur
		 * 2) context.registerShutdownHook()--> working*/
		Hello hello = context.getBean("hello",Hello.class);
		hello.sample();
		context.close();
}
}
