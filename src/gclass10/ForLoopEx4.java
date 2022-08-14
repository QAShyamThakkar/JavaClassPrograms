package gclass10;

public class ForLoopEx4 {

	public static void main(String[] args) {
		//find factorial of a number
		// 5! = 1*2*3*4*5 = 120
		// 7! = 1*.....7
		int fact=1;
		for(int i=1; i<=5 ; i++ ) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);

	}

}
