package com.jrout.tutorial.core.classes;

public class GoldSmith {
	// Object ... instance
	public static void main(String[] args) {
		/*int a = 10;
		int b = a;
		System.out.println(b);*/
		
		Ring gold = new Ring();
		gold.color = "Gold"; // state
		gold.metalType ="Gold";
		gold.weight = 3;
		
		Ring gold2 = gold;
		
		System.out.println(gold.color);
		gold.color = "Red";
		System.out.println(gold.color);
		
		gold2.color = "Purple";
		
		System.out.println(gold.color +" " + gold2.color);
		
		System.out.println(gold == gold2);
		
		Ring yellow = new Ring();
		yellow.color = "Yellow";
		yellow.metalType = "Gold";
		yellow.weight = 6;
		
		System.out.println(gold == yellow);
		
		/*System.out.println(gold.color);
		gold.color = "Red";
		System.out.println(gold.color);*/
		
//		System.out.println(yellow.color);
		
		String name1 = new String("Rohit");
		String name2 = new String("Rohit");
		
		System.out.println("name1 == name2 >>" + (name1 == name2));
		System.out.println("name1.equals(name2) >>" + (name1.equals(name2)));
	}
}