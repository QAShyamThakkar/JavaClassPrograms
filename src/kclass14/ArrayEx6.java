package kclass14;

public class ArrayEx6 {

	public static void main(String[] args) {
		// find the index position of target element
		// Array -> 45 12 37 89 17 56 
		// targetElement = 37 
		// output = 2

		
		int targetElement = 12;
		int array[]= {45,12,37,89,17,56};
		
		for(int i=0; i<array.length;i++) {
			if(targetElement == array[i]) {
				System.out.println("index of target element "+ targetElement+" = "+i);
			}
		}
		
	}

}
