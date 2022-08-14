package jclass13;

public class WhileEx4 {

	public static void main(String[] args) {
		// 1 - 2 - 3 - 4 - 5
		
		int i=1;
		int result=0;
		while(i<=5) {
			result = result - i;
			i++;
		}
		System.out.println(result);

	}

}
