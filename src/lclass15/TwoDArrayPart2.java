package lclass15;

public class TwoDArrayPart2 {

	public static void main(String[] args) {
		

		int array[][] = {{1,2,3}, {4,5,6} };
		
		//what should we modify here
		for(int i=0; i<2 ; i++) {  //outer loop no of rows
			
			for(int j=0; j<3; j++) {   //inner loop is no of columns
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
