package com.jrout.tutorial.core.staticexample;

public class StaticExample {
	static int a = 10;
	static final String name = "Jayram"; 
	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		System.out.println(a);
		staticMethod();
		System.out.println(name);
	}
	
	public static void staticMethod(){
		
	}
	public void nonStaticMethod(){
		staticMethod();
	}
	
}
