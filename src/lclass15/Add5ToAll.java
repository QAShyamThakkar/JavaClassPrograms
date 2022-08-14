package lclass15;

public class Add5ToAll {

	public static void main(String[] args) {
		
		int array[] = {10,20,30,40,50};
		
		int addArray[] = new int[5];
		
		for(int i=0 ; i< array.length;i++) {
			addArray[i]=array[i]+5;
		}
		
		for(int n:addArray) {
			System.out.println(n);
		}

	}

}
