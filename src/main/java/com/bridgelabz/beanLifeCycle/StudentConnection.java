package com.bridgelabz.beanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentConnection {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/college";
	private String userName = "root";
	private String password = "root";
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		System.out.println("Retrived  Student Data");
		//Load Driver
		Class.forName(driver);
		// get a connection
		Connection con =DriverManager.getConnection(url, userName, password);
		// execute Query
		Statement stmt = con.createStatement();
		ResultSet rs =stmt.executeQuery("SELECT * FROM college.Student");
		while(rs.next()) {
			int Sid = rs.getInt(1);
			String Sname = rs.getString(2);
			String Branch = rs.getString(3);
			int mark = rs.getInt(4);
			System.out.println(Sid+" : "+Sname+" : "+Branch+" : "+mark);
		}
	}
	public void deleteStudentRecord(int Sid) throws ClassNotFoundException, SQLException {
		//Load Driver
				Class.forName(driver);
				// get a connection
				Connection con =DriverManager.getConnection(url, userName, password);
				// execute Query
				Statement stmt = con.createStatement();
				stmt.executeQuery("delete From college.Student where Sid="+Sid);
				System.out.println("Student Deleted Successfully");
	}	
}