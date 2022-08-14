package kclass14;

public class ReverseNumber {

	public static void main(String[] args) {
		// reverse number 1234
		
		// 4321

		int lastDigit =0, num = 1234;
		int revNumber = 0;
		while(num!=0) {
			lastDigit = num %10; 
			revNumber = revNumber * 10 + lastDigit;
			num = num/10; 
		}
		       
		
		System.out.println(revNumber);
		
		
	}

}
