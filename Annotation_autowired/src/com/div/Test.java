package com.div;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
// @Autowired
// static Employee e;
public static void main(String[] args) {
	ApplicationContext contex=new ClassPathXmlApplicationContext("Web.xml");
	Employee e= (Employee) contex.getBean("emp");
	 e.displayInfo();
}
}
