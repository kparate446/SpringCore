package com.bridgelabz.beanLifeCycle;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Scanner sc = new Scanner(System.in);
//	StudentConnection connection = new StudentConnection();
//	connection.selectAllRows();
////	System.out.println("deleted the record");
////	int Sid = sc.nextInt();
//	connection.deleteStudentRecord(3);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans11.xml");
		StudentConnection connection = context.getBean("studentConnection",StudentConnection.class);
		connection.selectAllRows();
		context.close();
		
}
}
