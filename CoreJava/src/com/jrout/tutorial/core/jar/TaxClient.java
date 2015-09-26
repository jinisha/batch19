package com.jrout.tutorial.core.jar;

import jrout.tutorial.tax.calc.TaxManCalcualtor;
// This is part of CoreJava Module
public class TaxClient {

	public static void main(String[] args) {
		TaxManCalcualtor tac = new TaxManCalcualtor();
		tac.callToCalculate(4, 5 ,"Jay");
	}
}
