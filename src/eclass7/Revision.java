package eclass7;

public class Revision {

	public static void main(String[] args) {
		
		System.out.println( (8>6) && (3<4) || (7<2) );
		System.out.println( !(true) && false || false || true);
		
		// if age > 18
			// if income > 3000 then tax = 2.5
			// if income < 1000 then tax = 1.5
			// else No tax
		//else Under age
		
		int age = 29;
		int income = 900;
		
		if(age > 18) {
			
			if(income > 3000) {
				System.out.println("Tax is 2.5%");
				
			}
			else if(income <1000) {
				System.out.println("Tax is 1.5");
			}
			else {
				System.out.println("No tax");
			}
		}else {
			System.out.println("under age");
		}
	}

}
