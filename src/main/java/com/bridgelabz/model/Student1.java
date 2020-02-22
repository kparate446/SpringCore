package com.bridgelabz.model;

public class Student1 {
	private int id;
	private String StudentName;
	// set the Student Id
	// Setting method is used to inject the Dependency
	public void setId(int id) {
		this.id = id;
	}
	
	// set the Student name
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	// Display the Student name
	public void displayStudent() {
		System.out.println("Student name is: "+StudentName+"\t Student id is: "+id);
		
	}
}
