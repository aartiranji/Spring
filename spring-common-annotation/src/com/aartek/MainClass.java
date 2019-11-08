package com.aartek;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//System.out.println("Beans.xml file loaded");
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College clg = (College) context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is : "+clg);
		clg.test();
		
		((AnnotationConfigApplicationContext)context).close();
		
	}
}
