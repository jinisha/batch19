package com.jrout.tutorial.core.inheritance.abstractexample;

public class Lenovo extends Computer {

	public Lenovo(String name, String brand) {
		super(name, brand);
	}
	
	@Override
	public String operatingSystem(){
		return getName() + " has Windows or UNIX";
	}
}
