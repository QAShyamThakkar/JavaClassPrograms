package kclass14;

public class ArrayEx5 {

	public static void main(String[] args) {
		// find the max number from an array
		//  Array -> 45 12 37 89 17 56
		// output -> 89
		
		int max=0;
		int array[]= {1, 5, 23, 8};
		
		for(int temp:array) {
			if(max < temp) {
				max = temp;
			}
		}
		System.out.println(max);
	}

}
