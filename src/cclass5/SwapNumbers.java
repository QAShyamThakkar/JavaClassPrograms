package cclass5;

public class SwapNumbers {

	public static void main(String[] args) {
		
		
		// take two variables say x= 10, y= 20 and swap the two numbers. After swapping result is x=20, y=10

		int x=10;
		int y=20;
		
		int k=0;
		
		System.out.println("Before swapping");
		 System.out.println("x = "+x);
		 System.out.println("y = "+y);
		 
		 //code to swap
		 k = x;       //10
		 x = y;       //20
		 y = k;       //10
		
		 System.out.println("After swapping");
		 System.out.println("x = "+x);
		 System.out.println("y = "+y);
		 
		
	}

}
