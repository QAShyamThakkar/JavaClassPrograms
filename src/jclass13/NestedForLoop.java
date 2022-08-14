package jclass13;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {  // outer loop
			
			for(int j=1; j<=3; j++) {   //inner loop
				System.out.println("Inner loop "+j);
			}
			
			System.out.println("************************Outer loop "+i);
		}

	}

}
