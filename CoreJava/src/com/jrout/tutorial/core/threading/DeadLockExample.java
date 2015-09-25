package com.jrout.tutorial.core.threading;

public class DeadLockExample {
	public static String bike = "Bike";
	public static String helmet = "Helmet";
	
	public static void main(String[] args) {
		Boy boy = new Boy();
		boy.setName("Boy");
		
		Girl girl = new Girl();
		girl.setName("Girl");
		
		boy.start();
		girl.start();
	}
	
	private static class Boy extends Thread {
		@Override
		public void run() {
			synchronized(bike) {
				String threadName =Thread.currentThread().getName();
				System.out.println(threadName + " Got Bike and waiting for helmet");
				synchronized(helmet) {
					System.out.println(threadName + " Got Helmet");
					System.out.println(threadName + " Is riding now...");
				}
			}
		}
	}
	
	private static class Girl extends Thread {
		@Override
		public void run() {
			synchronized(bike) {
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + " Got bike and waiting for helmet");
				synchronized(helmet) {
					System.out.println(threadName + " Got helmet");
					System.out.println(threadName + " Is riding now...");
				}	
			}
		}
	}
}
