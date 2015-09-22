package com.jrout.tutorial.core.threading;

public class ThreadingClient {

	public static void main(String[] args) {
		System.out.println("Starting..");
		for(int i = 0 ; i < 5; i++) {
			
			System.out.println(i +" Name =" + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ending..");
	}

}
