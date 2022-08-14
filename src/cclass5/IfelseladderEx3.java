package cclass5;

public class IfelseladderEx3 {

	public static void main(String[] args) {
		
		
		//take any number from 0-6 and print day of week
		// 0 -> Sunday
		// 1 -> Monday
		// 2 -> Tuesday
		// 3 -> wednesday.....
		//6 -> Saturday
		
		int input = 10;
		
		if(input == 0) {
			System.out.println("Sunday");
		}
		else if(input == 1) {
			System.out.println("Monday");
		}
		else if(input == 2) {
			System.out.println("Tuesday");
		}
		else if(input == 3) {
			System.out.println("Wednesday");
		}
		else if(input == 4) {
			System.out.println("Thrusday");
		}
		else if(input == 5) {
			System.out.println("Friday");
		}
		else if(input == 6) {
			System.out.println("saturday");
		}
		else {
			System.out.println("Invalid input");
		}

	}

}
