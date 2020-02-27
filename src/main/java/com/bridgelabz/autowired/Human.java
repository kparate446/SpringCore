package com.bridgelabz.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	// bean name and Heart name Are Same
	private Heart heart;// Heart is a of Object Create a Class
	// Default Constructor is Used @Autowired
	public Human() {
		
	}
//	@Autowired 
	public Human(Heart heart) { // Construnctor
		
		this.heart = heart;
		// Autowired Constructor
	}
	@Autowired
	public void setHeart(Heart heart) {// Setter Method
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

