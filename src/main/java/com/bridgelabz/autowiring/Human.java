package com.bridgelabz.autowiring;

public class Human {
	// bean name and Heart name Are Same
	private Heart heart;// Heart is a of Object Create a Class

	public void setHeart(Heart heart) {
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
