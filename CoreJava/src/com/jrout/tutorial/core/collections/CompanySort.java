package com.jrout.tutorial.core.collections;

import java.util.Comparator;

public class CompanySort implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Mouse mou1 = (Mouse) o1;
		Mouse mou2 = (Mouse) o2;
		return mou1.getBrand().compareTo(mou2.getBrand());
	}

}
