package com.jrout.tutorial.core.inheritance;

public class Client {

	public static void main(String[] args) {
//		Employee emp = new Employee("Jay",234);
		Employee ie = null;
		
		ie =  new ITEmployee("Ishtiaq",34);
		System.out.println(ie.getName());
		System.out.println(ie.getTieColor());
		
		ie =  new NonITEmployee("Jigs",344);
		System.out.println(ie.getName());
		System.out.println(ie.getTieColor());
	}
}