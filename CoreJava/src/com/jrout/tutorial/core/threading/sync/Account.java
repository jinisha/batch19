package com.jrout.tutorial.core.threading.sync;

public class Account {
	private int balance = 50;
	
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int amount){
		
		System.out.println(Thread.currentThread().getName()+ " Withdrawing "+ amount);
		balance = balance - amount;
	}
}
