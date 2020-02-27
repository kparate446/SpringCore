package com.bridgelabz.autowiring;

public class Human {
	public Human() {
		System.out.println(heart);
	}
	// bean name and Heart name Are Same
	private Heart heart;// Heart is a of Object Create a Class
	
	public Human(Heart heart) { // Construnctor
		System.out.println(heart);
		this.heart = heart;
	}
	public void setHeart(Heart heart) {
		System.out.println(heart);
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
