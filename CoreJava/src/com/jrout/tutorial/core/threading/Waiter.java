package com.jrout.tutorial.core.threading;

public class Waiter {
	String waiterName;
	public Waiter(String name) {
		this.waiterName = name;
	}
	public void servers(String name){
		System.out.println("Waiter : "+Thread.currentThread().getName());
		for(int i =0 ; i < 5 ;i++) {
			switch (i) {
			case 0:
				System.out.println(i+" "+waiterName+" Servers Idli to : "+ name);
				break;
			case 1:
				System.out.println(i+" "+waiterName+" Servers Dosa to : "+ name);
				break;
			case 2:
				System.out.println(i+" "+waiterName+" Servers Italian to : "+ name);
				break;
			case 3:
				System.out.println(i+" "+waiterName+" Servers Mexican to : "+ name);
				break;
			case 4:
				System.out.println(i+" "+waiterName+" Servers Desert to : "+ name);
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
}
