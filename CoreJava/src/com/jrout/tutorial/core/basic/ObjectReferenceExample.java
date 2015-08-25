package com.jrout.tutorial.core.basic;

import com.jrout.tutorial.core.classes.Person;

public class ObjectReferenceExample {

	public static void main(String[] args) {
		Person per = new Person("Jay");
		
		int a = 3;
		Integer intA = new Integer(a);
		
		int b = intA; // auto boxing...
		
		Integer intB = a;
		
//		callMe(a);
		callMe(intA);
		
		System.out.println("Value =" + intA);
		
//		printPerson(per);
//		System.out.println("Main "+ per.getName());
		
//		System.out.println(per.getName());
//		
//		new ObjectReferenceExample().printPerson(per);
		
//		Person per1 = new Person("Jay");
	}
	
	public static void callMe(int a){
		System.out.println("Before "+a);
		a = 10;
		System.out.println("After = "+ a);
	}
	
	public static void callMe(Integer a){
		System.out.println("Before "+a);
		a = new Integer(10);
		System.out.println("After = "+ a);
	}
	
	public static void printPerson(Person per) {
		System.out.println("Before "+ per.getName());
		per.printDetails();
		per.setName("JayramRout");
		
		System.out.println("AFter "+ per.getName());
	}
}
