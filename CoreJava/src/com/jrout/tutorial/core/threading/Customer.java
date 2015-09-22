package com.jrout.tutorial.core.threading;

public class Customer extends Thread {
	private Waiter waiter;
	private String name; 
	public Customer(String name , Waiter waiter) {
		this.waiter = waiter;
		this.name = name;
		setName(name);
	}
	
	public void serveFood(){
		System.out.println("Customer:serveFood : "+Thread.currentThread().getName());
		waiter.servers(this.name);
	}
	
	@Override
	public void run() {
		System.out.println("Customer:run : "+Thread.currentThread().getName());
		waiter.servers(this.name);
	}
}