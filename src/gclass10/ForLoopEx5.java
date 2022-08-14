package gclass10;

public class ForLoopEx5 {

	public static void main(String[] args) {
		
		// 0.1 + 0.2 + 0.3 + 0.4 + 0.5 .....+0.9
		// 1/10 2/10 3/10 4/10.......9/10
		
		double num; 
		double sum = 0.0;
		for(double i=1.0; i<=9; i++) {
			num = i/10.0;  //0.1
			sum = sum + num; //0.0 +0.1 = 0.1
			System.out.println(num);
		}

		System.out.println("Sum is "+sum);
	}

}
