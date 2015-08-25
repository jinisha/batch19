package com.jrout.tutorial.core.overloading;

public class OverloadingExample {

	public static void main(String[] args) {
		OverloadingExample oe = new OverloadingExample();
		int result  = oe.add(10, 20);
		System.out.println(result);
		int secondResult  = oe.add(10, 20, 30);
		
		oe.add("10", 20);
		oe.add("10", 20);

//		add(20,"10");
		oe.printDetails("Jayram");
	}
	
	public int add(int a , int b){
		return (a+b); 
	}
	
	public int add(int a , int b , int c){
		return (a+b+c); 
	}
	
	public int add(String val , int val2) {
		return Integer.parseInt(val) + val2;
		
	}
	
	public int add(int val2, String val) {
		return Integer.parseInt(val) + val2;
	}
	
	public void printDetails(String fname){
		System.out.println("Name is " + fname);
	}

	public void printDetails(String fname, String lname){
		System.out.println("Name is " + fname +" " + lname);
	}
}
