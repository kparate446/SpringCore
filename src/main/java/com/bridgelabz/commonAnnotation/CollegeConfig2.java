package com.bridgelabz.commonAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.bridgelabz.commonAnnotation")
public class CollegeConfig2 {
	
//	@Bean(name = {"ColBean","CollegeBean"} )
	@Bean
	public principal2 principalBean() {
		return new principal2();
	}
	@Bean
	public College collegeBean() {
//		College college = new College(principalBean());// Principal bean by a setter injection
		College college = new College();
		college.setPrincipal2(principalBean());
		
		return college;
	}
}
