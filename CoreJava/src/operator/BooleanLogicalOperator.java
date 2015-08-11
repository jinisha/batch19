package operator;

public class BooleanLogicalOperator {

	public static void main(String[] args) {
		String one = "67";
		String two = "67";
		
		int ageOne = Integer.parseInt(one);
		int ageTwo = Integer.parseInt(two);
		
		int heightOne = 6;
		int heightTwo = 5;
		
		/*boolean isSameAge = (ageOne == ageTwo);
		boolean isSameHeight = (heightOne == heightTwo);
		boolean isSame = isSameAge & isSameHeight;
		System.out.println(isSame);
		*/
//		System.out.println((ageOne == ageTwo) & (heightOne == heightTwo));
//		System.out.println(heightOne == heightTwo);
		
//		System.out.println(isSameAge & isSameHeight);
		
		//Diff between & and && 
		System.out.println((ageOne == ageTwo) || (heightOne == heightTwo++));
		
		System.out.println(heightTwo);
	}

}
