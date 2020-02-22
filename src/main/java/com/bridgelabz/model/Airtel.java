package com.bridgelabz.model;

import com.bridgelabz.service.Sim;

public class Airtel implements Sim {
//	public Airtel() {
//		System.out.println("Airtel Constructor Call");
//	}
	public void calling() {
		System.out.println("calling using airtel Sim");
		
	}
	@Override
	public void data() {
		System.out.println("Browsing Internet using Airtel Sim");
		
	}

}
