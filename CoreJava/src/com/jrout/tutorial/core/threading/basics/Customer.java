package com.jrout.tutorial.core.threading.basics;

public class Customer extends Thread {
	public Customer(String name , Waiter waiter) {
		super(waiter);
		setName(name);
	}
}