package com.jrout.tutorial.core.inheritance.abstractexample;

public class Apple extends Computer {

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
}
