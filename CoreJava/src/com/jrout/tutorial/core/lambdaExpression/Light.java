package com.jrout.tutorial.core.lambdaExpression;

public class Light implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" I am going to light your room..." );
	}
}