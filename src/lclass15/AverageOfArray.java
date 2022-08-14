package lclass15;

public class AverageOfArray {

	public static void main(String[] args) {
		
		// Array 12, 30, 78, 16
		// calculate and print sum of all numbers in the array 12 + 30 +78+16
		// print the length of array

		int array[] = {12,30,78,16};
		int sum=0;
		for(int i=0; i<array.length;i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum = "+sum);
		
		int len = array.length;
		System.out.println("Length of array = "+len);
		
		int average = sum/len;
		System.out.println("Average of array =" +average);
	}

}
