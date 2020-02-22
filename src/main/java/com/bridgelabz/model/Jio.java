package com.bridgelabz.model;

import com.bridgelabz.service.Sim;

public class Jio implements Sim {
//	public Airtel() {
//		System.out.println("Airtel Constructor Call");
//	}
	@Override
	public void calling() {
		System.out.println("calling using Jio Sim");
		
	}
	@Override
	public void data() {
		System.out.println("Browsing Internet using Jio Sim");
		
	}

}
