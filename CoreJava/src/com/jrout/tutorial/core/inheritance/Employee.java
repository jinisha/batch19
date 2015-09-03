package com.jrout.tutorial.core.inheritance;

public class Employee {
	private String name;
	private int empId;
	private String proffession;
	
	public Employee(String name , int empId) {
		this.name = name;
		this.empId = empId;
//		System.out.println("Employee.Employee()");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getProffession() {
		return proffession;
	}
	public void setProffession(String proffession) {
		this.proffession = proffession;
	}
	
	/**
	 * Super Class method
	 * @return
	 */
	public String getTieColor(){
		return "Purple";
	}
}