package com.bridgelabz.beanLifeCycleInitializingBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentConnection {
	private String driver;
	private String url;
	private String userName;
	private String password;
	// My Connection Obj
		Connection con;
	// Access the value in Bean write setter method

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	// Connection of JDBC 
	// Init it is a find EveryWhere
	/**@PostConstruct */
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("Init Method call");
		createStudentDBConnection(); 
	}
	
//	@PostConstruct // Automatically connected
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		// get a connection
		con = DriverManager.getConnection(url, userName, password);
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		System.out.println("Retrived  Student Data");
		// Load Driver
		/** It is used the connection @PostConstruct --> call Automatically*/
		// execute Query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM college.Student");
		while (rs.next()) {
			int Sid = rs.getInt(1);
			String Sname = rs.getString(2);
			String Branch = rs.getString(3);
			int mark = rs.getInt(4);
			System.out.println(Sid + " : " + Sname + " : " + Branch + " : " + mark);
		}
	}

	public void deleteStudentRecord(int Sid) throws ClassNotFoundException, SQLException {
		// Load Driver
		// Class.forName(driver);
		// get a connection
		// Connection con =DriverManager.getConnection(url, userName, password);
		// execute Query
		/** It is used the connection @PostConstruct --> call Automatically*/
		Statement stmt = con.createStatement();
		stmt.executeQuery("delete From college.Student where Sid=" + Sid);
		System.out.println("Student Deleted Successfully");

	}
	
	
	public void closeConnection() throws SQLException {
		// Cleaning up the Container
		// All Connectuion are Closed
		
		con.close();
	}
	/**@PreDestroy*/
	public void destroy() throws SQLException {
		// Cleaning up the Container
		System.out.println("Destroy method Calling");
		closeConnection();
	}

}