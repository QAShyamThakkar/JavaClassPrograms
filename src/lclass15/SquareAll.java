package lclass15;

public class SquareAll {

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5};
		
		int squareArray[] = new int[5];
		
		for(int i=0;i<array.length;i++) {
			squareArray[i] = array[i] * array[i];
		}

		for(int i=0;i<squareArray.length;i++) {
			System.out.println(squareArray[i]);
		}
	}

}
