package com.jrout.tutorial.core.inheritance.abstractexample;

public class AbstractClient {

	public static void main(String[] args) {
		Computer lenovo = new Lenovo("acer","Lenovo");
		Computer apple = new Apple("applepro","Apple");
		
		System.out.println(lenovo.operatingSystem());
		System.out.println(lenovo.touchScreen());
		
		System.out.println(apple.operatingSystem());
		System.out.println(apple.touchScreen());
		
	}
}