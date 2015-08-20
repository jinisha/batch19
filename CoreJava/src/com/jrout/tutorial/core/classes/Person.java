package com.jrout.tutorial.core.classes;

public class Person {
	private String name;
	private int age;
	private String occupation;
	private Address address;
	
	public void setAge(int age) {
		if(age <= 0) {
			this.age = 1;	
		}else {
			this.age = age;
		}
	}
	public int getAge(){
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setOccupation(String occX) {
		this.occupation = occX;
	}
	
	public void printDetails(){
		System.out.println(name +" " + age +" "+ occupation);
	}
}