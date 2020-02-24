package com.bridgelabz.beanLifeCycle;

import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
	StudentConnection connection = new StudentConnection();
	connection.selectAllRows();
//	System.out.println("deleted the record");
//	int Sid = sc.nextInt();
	connection.deleteStudentRecord(3);
}
}
