package hclass11;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		//food delivery menu
		// 1 for pizza
		// 2 for coke
		// 3 for icecream
		// 4 to exit
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1 for pizza");
			System.out.println("2 for coke");
			System.out.println("3 for icecream");
			System.out.println("4 to exit");
			
			choice = sc.nextInt();  //3
			System.out.println("You have selected option "+choice);
		}while(choice <=3);

	}

}
