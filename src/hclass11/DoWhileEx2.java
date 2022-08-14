package hclass11;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		
		//+,-,*,/
		
		Scanner sc = new Scanner(System.in);
		String operation;
		int choice;
		System.out.println("Enter first numer");
		int a = sc.nextInt();
		System.out.println("Enter second numer");
		int b = sc.nextInt();
		int result = 0;
		do {
			System.out.println("Select the operation to be performed");
			System.out.println("+ for addition");
			System.out.println("- for subtraction");
			System.out.println("* for multiplication");
			System.out.println("/ for divsion");
			
			operation = sc.next();
			
			System.out.println("You have entered "+operation);
			switch(operation) {
			case "+":
				result = a+b;
				break;
			case "-":
				result = a-b;
				break;
			case "*":
				result = a*b;
				break;
			case "/":
				result = a/b;
				break;
			
			}
			System.out.println("result = "+result);
			System.out.println("Do you want to continue, enter 1= yes or 2=no");
			choice = sc.nextInt();
		}while(choice==1);
		

	}

}
