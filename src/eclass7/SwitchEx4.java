package eclass7;

public class SwitchEx4 {

	public static void main(String[] args) {
		
		// 0-10 -> Print even/odd
		// 0-> even
		//1 -> odd
		// 2-> even
		
		int num = 5;
		switch(num) {
		case 0:
		case 2:
		case 4:
			System.out.println("Even");
			break;
			
			
		case 1:
		case 3:
		case 5:
			System.out.println("Odd");
			break;
		
		}

	}

}
