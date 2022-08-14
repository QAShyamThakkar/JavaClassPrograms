package aclass2;

public class ModulusPart1 {
	
	public static void main(String args[]) {
		 // any number % 10 will give last digit
		System.out.println(18 % 10);  // 8
		System.out.println(20 % 10);  // 0
		System.out.println(56 % 10);  // 6
		System.out.println(98 % 10);  // 8
		System.out.println(24908765 % 10);  // 5
		
		
		// any number divide by 10 will complete number except the last digit
		System.out.println(18 / 10);  // 1
		System.out.println(20 / 10);  // 2
		System.out.println(567 / 10);  // 56
		System.out.println(98 / 10);  // 9
		System.out.println(102 / 10);  // 10 
		
		double d = 18 / 10;
		System.out.println(d);
		
	}

}
