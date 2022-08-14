package dclass6;

public class NestedIf {

	public static void main(String[] args) {
		
		// if age > 18
			// if weight > 50 
					//You can donate blood
			// else Under weight
		//else under age
		
	
		int age= 10;
		int weight = 20;
		
		//only when the outer If condition is true then only check for inner if condition
		if(age>18) {
			
			if(weight > 50) {
				System.out.println("You can donate blood");
			}
			else {
				System.out.println("You are under weight");
			}
			
		}else {
			System.out.println("You are under age");
		}

	}

}
