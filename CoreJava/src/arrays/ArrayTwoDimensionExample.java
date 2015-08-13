package arrays;

public class ArrayTwoDimensionExample {
	public static void main(String[] args) {
		String jay[] = {"Jay","Honda","Red"};
		String sakthi[] = {"Sakthi","Kia"};
//		String raj[] = {"Raj","Audi"};
		
		String humanDetails[][] = {jay,sakthi,{"Raj","Audi"}};
		
		System.out.println(humanDetails[0][1]);
		System.out.println(humanDetails[1][1]);
		System.out.println(humanDetails[2][1]);
		
		System.out.println("Jay Color " + humanDetails[0][2]);
		
		
		
	}
}
