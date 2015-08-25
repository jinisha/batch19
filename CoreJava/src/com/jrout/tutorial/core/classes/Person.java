package com.jrout.tutorial.core.classes;

public class Person {
	private String name;
	private int age;
	private String occupation;
	private Address address;
	
	public Person(String name ){
		this.name = name;
	}
	
	public Person(String name , int age){
//		this.name = name;
		this(name);
		this.age = age;
	}
	
	public Person(String name , int age, String occupation){
		this(name, age);
		this.occupation = occupation;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public String getName(){
		return this.name;
	}
	public void printDetails(){
		System.out.println(name +" " + age +" "+ occupation);
//		callMe();
	}
	
	public void callMe(){
		System.out.println("Person.callMe()");
	}
	
	@Override
	protected void finalize() throws Throwable {
		address = null;
		System.out.println("I am in finalize for "+ name);
	}
}