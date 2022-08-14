package kclass14;

public class ArrayEx4 {

	public static void main(String[] args) {
		// Array -> 45 12 37 89 17 56
		// print sum of all numbers in the array
		
		int array[]= {45,12,37,89,17,56};
		int sum=0;
		
		//for each loop
		for(int temp: array) {
			sum = sum + temp;
		}
		
		System.out.println(sum);
	}

}
