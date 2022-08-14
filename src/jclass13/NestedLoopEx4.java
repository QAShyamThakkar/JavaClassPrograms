package jclass13;

public class NestedLoopEx4 {

	public static void main(String[] args) {
		//____*
		//___**
		//__***
		//_****
		//*****

		for(int i=1; i<=5 ; i++) { //outer loop for rows
			
			for(int k=1; k<=(5-i) ;k++) { // inner for spaces
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++) { // inner loop for content
				System.out.print(i);
			}
			
			System.out.println();
			
		}
	}

}
