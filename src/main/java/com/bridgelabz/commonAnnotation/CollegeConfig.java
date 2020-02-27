package com.bridgelabz.commonAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component
// configure the bean file
@ComponentScan(basePackages = "com.bridgelabz.commonAnnotation")
public class CollegeConfig {
/*	
//	@Bean(name = {"ColBean","CollegeBean"} ) // multiple values name are occur
	@Bean
	public College collegeBean() { // collegeBean()--> bean id
		College college = new College();
		return college;
	}*/
}
