package com.jrout.tutorial.core.classes;

public class ReturnTypeExample {
	
	public static void main(String[] args) {
		ReturnTypeExample rte = new ReturnTypeExample();
		rte.printMe("Jayram","Rout",30);
		
		String message = rte.getMessage("Jayram") +" How are you";
		System.out.println(message);
		int result = rte.add(4,5);
		
		System.out.println(result);
	}
	
	public void printMe(String firstName, String lastName , int age) {
		System.out.println("Hello World..." + firstName +" "+ lastName+" "+ age);
	}
	
	public String getMessage(String firstName) {
		String message = "Hello " + firstName;
//		return "Hello" + firstName +" "+ lastName+" "+ age;
		return message;
	}
	
	public int add(int a , int b) {
		return a+b;
	}
	
}
