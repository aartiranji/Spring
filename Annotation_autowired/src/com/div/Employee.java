package com.div;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {  
	private int id;  
	private String name;
	@Autowired
	private Address address;  

	//method  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}
	
	//setters and getters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
/*	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}  
*/
}  