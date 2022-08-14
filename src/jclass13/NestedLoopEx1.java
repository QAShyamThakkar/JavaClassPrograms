package jclass13;

public class NestedLoopEx1 {

	public static void main(String[] args) {
		// ****
		// ****
		// ****
		// ****
		
		for(int i=1; i<=4; i++) {   //outer loop is for no of rows
			for(int j=1;j<=4;j++) {  // inner loop is no of columns
				System.out.print("*");    //content
			}
			System.out.println();
		}
	}

}
