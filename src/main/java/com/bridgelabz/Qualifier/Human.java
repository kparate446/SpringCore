package com.bridgelabz.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired // Same as output write the before dependency
	@Qualifier("Animalheart")
	// bean name and Heart name Are Same
	private Heart heart;// Heart is a of Object Create a Class
	// Default Constructor is Used @Autowired


	/**Same output remove constructor & setter method*/
	//	public Human() {
	//		
	//	}
	////	@Autowired 
	//	public Human(Heart heart) { // Construnctor
	//		
	//		this.heart = heart;
	//		// Autowired Constructor
	//	}
	//	// 2 Object is created in bean same as the type/ id(name)
	///**	@Autowired // Same as output write the before dependency
	//	@Qualifier("Animalheart")//or humanheart*/
	//	public void setHeart(Heart heart) {// Setter Method
	//		this.heart = heart;
	//	}
	public void startPumping(){
		if(heart !=null){
			heart.pump();
			System.out.println("Name of the "+heart.getNameOfAnimal()+"no of heart "+heart.getNoOfHeart());
		}
		else {
			System.out.println("Dead");
		}

	}
}

