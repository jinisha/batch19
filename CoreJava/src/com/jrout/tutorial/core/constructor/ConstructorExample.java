package com.jrout.tutorial.core.constructor;

/*import com.jrout.tutorial.core.classes.Person;
import com.jrout.tutorial.core.classes.Address;*/
import com.jrout.tutorial.core.classes.Address;
import com.jrout.tutorial.core.classes.Person;

public class ConstructorExample {

	public static void main(String[] args) {
//		Person per1 = new Person();
//		Person per2 = new Person();
//		System.out.println(per1.getAge());
		
		Person jigs = new Person("Jigs",20);
		System.out.println(jigs.getAge() + jigs.getName());
		
		Person raj = new Person("Raj",22);
		System.out.println(raj.getName());
		
		Person jinisha = new Person("Jinisha",23,"Student");
//		jinisha.setOccupation("Student");
		jinisha.printDetails();
				
		Person susmitha = new Person("Susmitha",18);
		susmitha.getAddress();
		
		System.out.println(jigs.getAge());

		System.gc();

		/*for(int i = 0 ; i < 500; i++) {
			new Person("Name"+i , i);
		}*/
		
		String name1 = "Hello";
		String name2 = "Hello";
		
		System.out.println("Value is "+ name1 == name2);
		System.out.println("Value is "+ name1.equals(name2));
	
		System.out.println(""+(2+3));
		System.out.println((2+3)+"");

	}

	public void hello(){
		int a = 9;
		
	}
}
