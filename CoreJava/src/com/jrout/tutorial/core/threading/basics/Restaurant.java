package com.jrout.tutorial.core.threading.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*Thread t1= new Thread(waiter,"Jayram");
Thread t2= new Thread(waiter,"Jigs");
Thread t3= new Thread(waiter,"Rohini");

t1.start();
t2.start();
t3.start();*/

public class Restaurant {

	public static void main(String[] args) {
		// System.out.println("Main "+Thread.currentThread().getName());

		long startTime = System.currentTimeMillis();
		Waiter waiter = new Waiter("Raju");

		/*waiter.run();
		waiter.run();
		waiter.run();*/
		Thread t1= new Thread(waiter,"Jayram");
		Thread t2= new Thread(waiter,"Jigs");
		Thread t3= new Thread(waiter,"Rohini");
		
		Thread[] threads = {t1, t2, t3};
		
		for (Thread t : threads) {
			t.start();
		}
		
		try {
			for (Thread t : threads) {
				t.join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		long totalTime = (endTime - startTime);
		long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);

		System.out.println("Total Time =" + timeSeconds);
		/*Thread t1= new Thread(waiter,"Jayram");
		Thread t2= new Thread(waiter,"Jigs");
		Thread t3= new Thread(waiter,"Rohini");

		t1.start();
		t2.start();
		t3.start();*/
		
		/*
		Customer jigs = new Customer("Jigs", waiter);
		Customer rohini = new Customer("Rohini", waiter);
		Customer nuzhat = new Customer("Nuzhat", waiter);

		List<Thread> threads = new ArrayList<>();
		threads.add(jigs);
		threads.add(rohini);
		threads.add(nuzhat);

		for (Thread t : threads) {
			t.start();
		}*/

		/*try {
			for (Thread t : threads) {
				t.join();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while(Thread.activeCount() > 1) {
			
		}*/
		//System.out.println(Thread.activeCount());
		
		
	}
}
