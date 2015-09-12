package com.jrout.tutorial.core.inheritance.abstractexample;

/**
 * 
 * @author Jayram
 *
 */
public abstract class Computer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	private String brand;
	
	public Computer(String name , String brand){
		this.name =name;
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Name is "+ name +" And Brand Name is "+ brand;
	}
	
	@Override
	public boolean equals(Object paramObject) {
		return super.equals(paramObject);
	}
	
	/**
	 * This method is use to print the operating system.
	 * @return
	 */
	public abstract String operatingSystem();
	
	public String touchScreen() {
		return "I have touch Screen";
	}
}