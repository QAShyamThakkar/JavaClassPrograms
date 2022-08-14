package eclass7;

public class SwitchEx1 {

	public static void main(String[] args) {
		
		// 0-9 print the number in english 0 -> zero, 1-> one
		
		int num = 8;
		switch(num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1: 
			System.out.println("One");
			break;
		case 2: 
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4: 
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
