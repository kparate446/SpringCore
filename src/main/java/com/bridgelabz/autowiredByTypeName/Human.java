package com.bridgelabz.autowiredByTypeName;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	// bean name and Heart name Are Same
	private Heart heart;// Heart is a of Object Create a Class
	// Default Constructor is Used @Autowired
	public Human() {
		
	}
//	@Autowired 
	public Human(Heart heart) { // Construnctor
		System.out.println(heart);
		this.heart = heart;
		// Autowired Constructor
	}
	// 2 Object is created in bean same as the type/ id(name)
	@Autowired
	public void setHeart(Heart heart) {// Setter Method
		System.out.println("set"+heart);
		this.heart = heart;
	}
	public void startPumping(){
		if(heart !=null){
			heart.pump();
		}
		else {
			System.out.println("Dead");
		}
		
	}
}

