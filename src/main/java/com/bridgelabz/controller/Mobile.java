 package com.bridgelabz.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.model.Airtel;
import com.bridgelabz.model.Vodafone;
import com.bridgelabz.service.Sim;

public class Mobile {
	public static void main(String[] args) {
		/* Airtel airtel = new Airtel(); airtel.calling(); airtel.data();*/
		/*Vodafone vodafone = new Vodafone(); vodafone.calling(); vodafone.data(); */
		/* Sim sim = new Vodafone();// Airtel // Run time polymophism sim.calling();sim.data();*/
		  
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");
		// Only airtel Sim Loaded
		Airtel air =(Airtel)context.getBean("airtel");
		air.calling();
		air.data();
		// Only Vodafone Sim Loaded
		Vodafone voda =  context.getBean("vodafone",Vodafone.class);
		voda.calling();
		voda.data();
		// Only Vodafone Sim Loaded & call Airtel Sim / Jio Sim change the Bean Method
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		// Only Vodafone Sim Loaded & call Airtel Sim / Jio Sim change the Bean Method
//				Sim sim1 = context.getBean("sim",Sim.class);
//				sim1.calling();
//				sim1.data();
	}
}
 