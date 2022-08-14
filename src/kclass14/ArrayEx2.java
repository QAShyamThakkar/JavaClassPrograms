package kclass14;

public class ArrayEx2 {

	public static void main(String[] args) {
		// mango, banana, apple, grapes, peach
		// store these values
		// print all values in array

		String fruitArray[] = new String[5];
		
		fruitArray[0] ="mango";
		fruitArray[1]= "banana";
		fruitArray[2] = "apple";
		fruitArray[3] = "grapes";
		fruitArray[4] = "peach";
		
		int len = fruitArray.length;
		System.out.println("Array length = "+len);  //5
		
		for(int i=0; i < fruitArray.length; i++) {
			System.out.println(fruitArray[i]); //print the values stored in array
		}
		System.out.println(fruitArray);   // memory address of array
	}

}
