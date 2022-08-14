package cclass5;

public class SwapExample1 {

	public static void main(String[] args) {
		
		 //take String type variables say glass1=beer, glass2=milk. After swapping glass1=milk,glass2=beer
		
		String glass1 = "beer";
		String glass2 = "milk";
		
		String glass3;
		
		glass3 = glass1;    //beer
		glass1 = glass2;    //milk
		glass2 = glass3;   //beer

		System.out.println(glass1);
		System.out.println(glass2);
	}

}
