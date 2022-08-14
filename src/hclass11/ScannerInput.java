package hclass11;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		
		int num1 = sc.nextInt(); // accept integer input using scanner class
		System.out.println("You have entered "+num1);
		
		System.out.println("Please enter your name");
		String name = sc.next();  // accept String input using Scanner class
		System.out.println("Your name is "+name);

	}

}
