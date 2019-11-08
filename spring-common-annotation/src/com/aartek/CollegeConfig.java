package com.aartek;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.aartek")
public class CollegeConfig {

	@Bean
	public Principal principalBean() {
		Principal principal = new Principal();
		return principal;
	}

	@Bean(name = "collegeBean")
	public College getCollege() {// bean id =getCollege
		College clg = new College();
		// College clg = new College(principalBean()); //constructor injection
		clg.setPrincipal(principalBean()); // setter injection
		clg.setTeacher(getTeacher());
		return clg;
	}

	@Bean
	public Teacher getTeacher() {
		Teacher teacher = new MathTeacher();
		return teacher;
	}

}
