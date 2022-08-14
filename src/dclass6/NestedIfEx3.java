package dclass6;

public class NestedIfEx3 {

	public static void main(String[] args) {
		int num = 11;
		
		// if a number is positive (num>0)
			// if number is even (num%2 == 0)
				//Number is even
			//Number is odd
		//Number is negative
		
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("1.Number is even");
			}
			else {
				System.out.println("2.number is odd");
			}
		}
		else {
			System.out.println("3.Number is negative");
		}

	}

}
