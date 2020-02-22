package com.bridgelabz.model;

public class Student2 {
	private int id;
	private String studentName;
	
	public Student2(int id) {// Spring is Internally Convert String to Int
		this.id = id; 
	}
	// Generate the Constructor --> To initialized non-static variable of a class during the time of initilization/Object creation
	public Student2(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	// Display the Student name
	public void displayStudent() {
		System.out.println("Student name is: "+studentName+"\t Student id is: "+id);
		
	}


}
