package com.bridgelabz.model;

public class Student3 {
//	Math math = new Math();// Tide Coupling
	private int id; // Common Dependency for Student3.java & anotherStudebt.java
	private Math3 math;// Math3 is a Class type // Common Dependency for Student3.java & anotherStudebt.java
	
	
	public void setId(int id) {
		this.id = id;
	}
	// Inside the Setter class inject the next setter method call
	public void setMath(Math3 math) {
		this.math = math;
	}

	public void paper() {
		math.mathPaper(); // call the Math3.class & print the Data
		System.out.println("Id->"+id);
	}
}  
