package com.bridgelabz.Annotation1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.Annotation1")
public class CollegeConfig2 {
	/*
	 * @Bean public Teacher MathTeacherBean() { return new MathTeacher(); }
	 *  
	 * // @Bean(name = {"ColBean","CollegeBean"} )
	 * 
	 * @Bean public principal2 principalBean() { return new principal2(); }
	 * 
	 * @Bean public College2 collegeBean() { // College college = new
	 * College(principalBean());// Principal bean by a setter injection College2
	 * college = new College2(); college.setPrincipal2(principalBean());
	 * college.setTeacher(MathTeacherBean()); return college; }
	 */
}
