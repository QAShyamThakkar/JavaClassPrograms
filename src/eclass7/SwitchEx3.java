package eclass7;

public class SwitchEx3 {

	public static void main(String[] args) {
	
		// Based on the character decide and perform the operation
		// + -> a+b
		// - -> a-b
		// * -> a*b
		// /-> a/b
		
		int a = 20, b=10;
		char operator = '*';
		
		switch(operator) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		default:
				System.out.println("Invalid input");
			
		}
		

	}

}
