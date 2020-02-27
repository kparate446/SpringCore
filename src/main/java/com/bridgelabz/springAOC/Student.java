package com.bridgelabz.springAOC;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component // Class is a Spring Bean Class
public class Student {
	
	
	public void show() {
		// log-> 2lines
		// Security -> 1line
		// transaction -> Begin
		
		///**only work--> called Automatically 15 statements -->Business logic
		// trans -> Commit
		System.out.println("Hello World");
		// log -> 2lines
	}

}
