package com.jrout.tutorial.core.variables;

public class Paper {
	String color; // instance
	final String company = "H2k"; 
	
	static int count = 0; // class level
	
	public Paper(String color , String company) {
		this.color =  color;
//		this.company = company;
		count++;
	}
	
	public void printDetails(String message ){
		int num = 10; // Local variable
		
		System.out.println("Half of company name is "+ company.length()/num);
		
		System.out.println(message +" " + color +" : "+ company);
		
	}
}