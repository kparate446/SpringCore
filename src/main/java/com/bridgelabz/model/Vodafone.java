package com.bridgelabz.model;

import com.bridgelabz.service.Sim;

public class Vodafone implements Sim {
	@Override
	public void calling() {
		System.out.println("calling using Vodafone Sim");
		
	}
	@Override
	public void data() {
		System.out.println("Browsing Internet using Vodafone Sim");
		
	}

}
