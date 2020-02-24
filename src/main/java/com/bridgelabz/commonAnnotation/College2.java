package com.bridgelabz.commonAnnotation;


public class College2 {
	 private principal2 principal2;
	 // Constructor Injection
	/*
	 * public College(principal2 principalBean) { 
	 * this.principal2 =principal2; }
	 */
	 // Setter Injection
	 
	public void setPrincipal2(principal2 principal2) {
		this.principal2 = principal2;
		System.out.println("set Principal");
	}


	public void test() {
//		principal2.principalInfo();
		 System.out.println("test method");
	 }
	
	
	
	
	
}
