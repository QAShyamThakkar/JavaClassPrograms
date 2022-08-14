package kclass14;

public class ArrayEx3 {

	public static void main(String[] args) {
		
		// Array -> 45 12 37 89 17 56
		// print only the even numbers from array -> 12 56

		int numArray[] = {45,12,37,89,17,56};
		
		for(int i=0; i< numArray.length;i++) {
			
			if(numArray[i] %2 == 0) {
				System.out.println(numArray[i]);
			}
			
		}
	}

}
