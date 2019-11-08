package com.aartek;

//@Component("collegeBean") // bean id = class name =college
public class College {

	private Principal principal ;//= new Principal(); or DI
	
	private Teacher teacher;// = new MathTeacher(); or DI
	
	//constructor-injection
	//public College(Principal principalBean) {
	//this.principal=principalBean;
	//}
	
	//setter-injection
	public void setPrincipal(Principal principalBean) {
	this.principal=principalBean;	
	}

	//setter-injection in interface
	public void setTeacher(Teacher teacher) {
	this.teacher=teacher;	
	}

	public void test() {
		System.out.println("inside test method");
		principal.principalinfo();
		teacher.teach();
	}


	

}
