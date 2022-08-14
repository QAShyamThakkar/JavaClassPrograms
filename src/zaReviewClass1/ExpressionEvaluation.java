package zaReviewClass1;

public class ExpressionEvaluation {

	public static void main(String[] args) {

		int a = 2, b = 10, c = 4, result;

		result = b * a / c;
		System.out.println(result);

		result = b / a * c; // 10/2*4
		System.out.println(result);

		result = b / a + c * c - a;
		System.out.println(result);

		result = b * a - c / c - b * a;
		System.out.println(result);
		
		result = a * b / c + a * 10 / b / c - 4;
				 // 2*10/4 + 2*10/10/4 -4
				//	5 + 2/4 -4
				//  5 + 0 - 4 = 1
		
		
		System.out.println(result);

	}

}
