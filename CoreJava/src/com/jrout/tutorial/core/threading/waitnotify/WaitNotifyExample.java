package com.jrout.tutorial.core.threading.waitnotify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		new Reader(calc).start();
		new Reader(calc).start();
		new Reader(calc).start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		calc.start();
	}
	
}


class Reader extends Thread {
	Calculator calc;
	public Reader(Calculator calc) {
		this.calc = calc;
	}
	@Override
	public void run() {
		synchronized(calc) {
			try {
				System.out.println("Waiting for the calculator to finish");
				calc.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total Value =" + calc.total);
	}
}
class Calculator extends Thread {
	int total = 0;
	@Override
	public void run() {
		synchronized(this){
			
			for(int i = 0 ; i < 50 ; i++) {
				total += i;
			}
			
			System.out.println("Calculator Notifying all the threads...");
			notifyAll();
		}
	}
}