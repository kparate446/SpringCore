package com.bridgelabz.commonAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.commonAnnotation")
public class CollegeConfig {
	/**
//	@Bean(name = {"ColBean","CollegeBean"} )
	@Bean
	public College collegeBean() {
		College college = new College();
		return college;
	}*/
}
