package operator;

public class RelationalExample {

	public static void main(String[] args) {
		String one = "67";
		String two = "67";
		int ageOne = Integer.parseInt(one);
		int ageTwo = Integer.parseInt(two);
		
		System.out.println(ageOne +" == "+ ageTwo + " "+ (ageOne == ageTwo));
		System.out.println(ageOne +" != "+ ageTwo + " "+ (ageOne != ageTwo));
		System.out.println(ageOne +" > "+ ageTwo + " "+ (ageOne > ageTwo));
		System.out.println(ageOne +" >= "+ ageTwo + " "+ (ageOne >= ageTwo));
		System.out.println(ageOne +" < "+ ageTwo + " "+ (ageOne < ageTwo));
		
	}
}