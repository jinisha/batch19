package com.jrout.tutorial.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingObject {

	public static void main(String[] args) {
		List<Mouse> jaymouse = new ArrayList<Mouse>();
		jaymouse.add(new Mouse("Black","Logistic"));
		jaymouse.add(new Mouse("White","Apple"));
		jaymouse.add(new Mouse("Apex","Lenovo"));
		
		for(Mouse mou : jaymouse) {
			System.out.println(mou.getColor() +" "+ mou.getBrand());
		}

		Collections.sort(jaymouse);
		System.out.println("==============");
		for(Mouse mou : jaymouse) {
			System.out.println(mou.getColor() +" "+ mou.getBrand());
		}
		
//		Collections.sort(jaymouse, lambdaexpress);
		Collections.sort(jaymouse, new CompanySort());
		System.out.println("=====Sorting using Company=========");
		for(Mouse mou : jaymouse) {
			System.out.println(mou.getColor() +" "+ mou.getBrand());
		}
		
		
		/*List<String> names = new ArrayList();
		names.add("name3");
		names.add("name4");
		names.add("name1");
		names.add("name2");
		
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println(names);*/
//		Set set = new TreeSet(names);
//		System.out.println(set);
	}

}
