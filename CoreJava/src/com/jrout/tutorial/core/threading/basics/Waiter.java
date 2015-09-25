package com.jrout.tutorial.core.threading.basics;
class Person {
	
}
public class Waiter extends Person implements Runnable {
	String waiterName;
	public Waiter(String name) {
		this.waiterName = name;
	}
	private synchronized void server(){
		System.out.println(waiterName + " is going to server : "+Thread.currentThread().getName());
		for(int i =0 ; i < 5 ;i++) {
			switch (i) {
			case 0:
				System.out.println(i+" "+waiterName+" Servers Idli to : "+ Thread.currentThread().getName());
				break;
			case 1:
				System.out.println(i+" "+waiterName+" Servers Dosa to : "+ Thread.currentThread().getName());
				break;
			case 2:
				System.out.println(i+" "+waiterName+" Servers Italian to : "+ Thread.currentThread().getName());
				break;
			case 3:
				System.out.println(i+" "+waiterName+" Servers Mexican to : "+ Thread.currentThread().getName());
				break;
			case 4:
				System.out.println(i+" "+waiterName+" Servers Desert to : "+ Thread.currentThread().getName());
				break;

			default:
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public void run() {
		server();
	}
}
