package operator;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		String batNumber = args[0];
		System.out.println(batNumber);
		boolean isBatch19 = "batch19".equals(batNumber);
		System.out.println("isBatch19 ="+ isBatch19);
		
//		int batchNumber = isBatch19 ? 19 : 50 ;
		int batchNumber = ("batch19" == batNumber) ? 19 : 50 ;
		
		String name = ("batch19" == batNumber) ? "BatchNineteen" : "Donot know";

		System.out.println(batchNumber);
		
		System.out.println(name);

	}

}
