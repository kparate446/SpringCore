package com.bridgelabz.loadingPropertiesFile;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")// Not used in Setter Method
	private String name;
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	@Value("${student.hobby}")// Not used in Setter Method
	private String hobby;
	
///	@Value("Kunal")
/**	@Value("${student.name}")
	public void setName(String name) {
//		this.name = name;
//	}*/
	
//	@Required
//	@Value("Java")
/**	@Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}*/
//	@Required
//	@Value("Football")
	/**@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}*/
	
	public void displayStudentInfo() {
		System.out.println("Student Name -"+name);
		System.out.println("Student Intrested Course -"+intrestedCourse);
		System.out.println("Student Hobby -"+hobby);
	
	}	
	
}
