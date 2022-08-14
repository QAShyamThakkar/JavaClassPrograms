package lclass15;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21 34
		
		int num1 = 0;
		int num2 = 1;
		int num3=0;
		
		System.out.println(num1);
		System.out.println(num2);
		while(num3 <=34) {
			num3 = num1 + num2; 
			System.out.println(num3);
			num1= num2;  
			num2=num3;   
		}
	}

}
