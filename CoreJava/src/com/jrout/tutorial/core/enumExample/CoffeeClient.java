package com.jrout.tutorial.core.enumExample;

enum Coffee { // Large 6 , med - 3 , small 1
	LARGE(6),MEDIUM(3),SMALL(1);
	int val;
	private Coffee(int size) {
		this.val = size;
	}
	
	public int intValue(){
		return this.val;
	}
	
}

public class CoffeeClient {

	public static void main(String[] args) {
		serveCoffee(Coffee.SMALL);
	}
	
	public static void serveCoffee(Coffee size){
		if(size == Coffee.LARGE){
			System.out.println("Serving Large Coffee with straw size as " +(size.intValue()+1));
		}else if(size  == Coffee.MEDIUM){
			System.out.println("Serving Medium Coffee with straw size as " +(size.intValue()+1));
		}else if(size  == Coffee.SMALL){
			System.out.println("Serving Small Coffee with straw size as " +(size.intValue()+1));
		}
	}
}
