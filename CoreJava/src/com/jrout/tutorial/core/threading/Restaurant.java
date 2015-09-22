package com.jrout.tutorial.core.threading;

public class Restaurant {

	public static void main(String[] args) {
		System.out.println("Main "+Thread.currentThread().getName());
		
		long startTime = System.currentTimeMillis();

		Waiter waiter = new Waiter("Raju");

		Customer jigs = new Customer("Jigs", waiter);
		jigs.start();
		jigs.setPriority(5);
		
		Customer rohini = new Customer("Rohini", waiter);
		rohini.start();
		
		System.out.println("I am at the end....");
		
		/*Customer nuzhat = new Customer("Nuzhat", waiter);
		nuzhat.serveFood();*/
		long endTime = System.currentTimeMillis();
		
		long totalTime = (endTime - startTime);
		
		System.out.println(rohini.isAlive());
		
		while(rohini.isAlive()) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Is still alive");
		}
		System.out.println("I am at the  end...");
	}
}
