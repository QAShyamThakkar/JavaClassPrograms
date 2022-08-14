package dclass6;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		
		// Print max of three number
		int a =9 , b=12, c=3;

		if( (a>b) && (a>c)) {
			System.out.println("A is max "+a);
		}
		else if( b> c) {
			System.out.println("B is max "+b);
		}
		else {
			System.out.println("C is max "+c);
		}
		
	}

}
