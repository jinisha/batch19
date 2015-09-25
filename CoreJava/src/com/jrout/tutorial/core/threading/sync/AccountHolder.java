package com.jrout.tutorial.core.threading.sync;

public class AccountHolder implements Runnable {
	Account account = new Account();
	
	@Override
	public void run() {
		for(int i=0; i < 5 ; i++) {
			makeWithdraw(10);
			if(account.getBalance() < 0) {
				System.out.println("Account is overdrawn "+ account.getBalance());
			}
		}
	}
	
	private synchronized void makeWithdraw(int amt){
		if(account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw " + amt);
			account.withdraw(amt);	
		}else {
			System.out.println("Not enough balance " + Thread.currentThread().getName());
		}
	}
}
