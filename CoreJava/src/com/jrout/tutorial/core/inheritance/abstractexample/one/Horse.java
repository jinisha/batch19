package com.jrout.tutorial.core.inheritance.abstractexample.one;

import com.jrout.tutorial.core.inheritance.abstractexample.Running;
import com.jrout.tutorial.core.inheritance.abstractexample.Sleeping;

public class Horse extends Animal implements Running , Sleeping {

	@Override
	public void color() {
		System.out.println("Black");
	}

	@Override
	public void run() {
		System.out.println("Horse Runs fast with his legs");
	}

	@Override
	public void sleep() {
		System.out.println("Horse does not sleep much");
		
	}
	
}