package iclass12;

public class NestedForLoopEx2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=4;i++) { //outer loop is for the number of rows
			
			for(int j=1; j<=4; j++) { // inner loop is for number of columns
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}
