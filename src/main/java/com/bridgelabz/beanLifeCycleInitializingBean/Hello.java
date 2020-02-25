package com.bridgelabz.beanLifeCycleInitializingBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 // Handle the Bean Life Cycle
public class Hello implements InitializingBean,DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside the property Set Method--> init");
	}
	
	public void sample() {
		System.out.println("Hello");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside destroy method Set Method--> destroy");

	}
	
	/*
	 * public void init() { System.out.println("inside hello class init Method"); }
	 * public void destroy() {
	 * System.out.println("inside hello class destroy Method"); }
	 */
	
	
}
