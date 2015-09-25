package com.jrout.tutorial.core.threading.sync;

public class ATMClient {

	public static void main(String[] args) {
		AccountHolder ah = new AccountHolder();
		
		Thread husband = new Thread(ah,"Husband");
		husband.start();
		
		Thread wife = new Thread(ah,"Wife");
		wife.start();

	}

}
