package arrays;

public class ArrayOneDimensionExample {

	public static void main(String[] args) {

		// int age1 = 12;

		int ages[] = { 12, 13, 14, 15, 67 };

		for (int idx = 0; idx < ages.length; idx++) {
			System.out.println(ages[idx]);
		}
		// for each age in ages
		for (int age : ages) {

		}

		String[] appleBag = { "KA", "OA", "DA" };
		//for each apple in appleBag
		for(String apple : appleBag) {
			if(!("OA" == apple))
				System.out.println("Apples "+ apple);
		}
		int idx = 0;
		/*for(;;){
			System.out.println("Value is "+ idx++);
		}*/
		
		while(true){
			System.out.println("Value is "+ idx++);
		}
		
		/*
		 * System.out.println(ages[1] +" lenght is =" + ages.length); ages[1] =
		 * 400; System.out.println(ages[1] +" lenght is =" + ages.length);
		 * 
		 * System.out.println(ages);
		 * 
		 * // ages[3] = 700; // java.lang.ArrayIndexOutOfBoundsException
		 * 
		 * int heights[] = new int[5]; heights[0] = 6; heights[1] = 2;
		 * heights[2] = 4; System.out.println(heights[2] +" Height Length ="+
		 * heights.length );
		 */
	}

}
