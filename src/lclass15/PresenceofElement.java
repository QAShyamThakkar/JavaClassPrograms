package lclass15;

public class PresenceofElement {

	public static void main(String[] args) {
		// Array 16,23,98,72,50
		// targetElement = 72 
		// If target element is present the print Element is present
		//Count the occurrence of target element
		int array[] = {16,23,98,72, 50, 72, 19, 72};
		int targetElement = 72;
		int count=0;
		
		for(int i=0; i<array.length;i++) {
			if(array[i]==targetElement) {
				count++;    //1
			}
		}
		
		if(count>0) {
			System.out.println("Element is present");
			System.out.println("Count ="+count);
		}else {
			System.out.println("Element is absent");
		}
	}

}
