package hclass11;

public class SeriesEx1 {

	public static void main(String[] args) {
		
		// 1/2 + 2/3 + 3/4 + 4/5 + 5/6 .......+ 9/10    n/n+1
		
		//print 1/2 2/3 3/4
		//sum  1 + 2+ 3+ 4

		double sum = 0.0;
		double temp;
		for(double i =1 ; i<=9 ; i++ ) {
			
			temp = i / (i+1.0);
			sum = sum + temp;
			
		}
		System.out.println(sum);
	}

}
