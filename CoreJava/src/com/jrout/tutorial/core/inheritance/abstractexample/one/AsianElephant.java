package com.jrout.tutorial.core.inheritance.abstractexample.one;

import com.jrout.tutorial.core.inheritance.abstractexample.Sleeping;

public class AsianElephant extends Elephant implements Sleeping {
	@Override
	public void color() {
		System.out.println("Elephant Color is Light Brown");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}
