package com.bridgelabz.AnnotationCollegeInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College2 {
	// Input the String
	@Value("${college.Name}")
	private String collegename;
	
	
	
	 @Autowired // injecting the data
	 private principal2 principal2;
	 @Autowired // injecting the data
	 private Teacher teacher;
	/** @Autowired // injecting the data
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired // injecting the data
	public void setPrincipal2(principal2 principal2) {
		this.principal2 = principal2;
		System.out.println("set Principal");
	}*/


	public void test() {
		principal2.principalInfo();
		teacher.teach();
		System.out.println("college name is"+collegename);
		 System.out.println("test method");
	 }
	
	
	
	
	
}
