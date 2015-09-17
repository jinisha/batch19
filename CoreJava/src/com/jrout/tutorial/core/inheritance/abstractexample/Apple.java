package com.jrout.tutorial.core.inheritance.abstractexample;

public class Apple extends Computer implements Running{

	public Apple(String name, String brand) {
		super(name, brand);
	}

	@Override
	public String operatingSystem(){
		return ("Apple OS");
	}
	
	public String touchScreen() {
		return "I have touch Screen with more 3 fingure feature...";
	}

	@Override
	public void run() {
		System.out.println("Apple runs fast with his OS");
	}
}
