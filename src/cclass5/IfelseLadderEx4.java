package cclass5;

public class IfelseLadderEx4 {

	public static void main(String[] args) {
		
		// if billAmount > 5000 then discount is 50% ( 0.5)
		// if billAmount > 2000 then discount is 20%
		// if billamount > 1000 then discount is 15%
		
		
		
		//total = billAmount * discount and print total
		
		int billAmount = 3000;
		double discount = 0;
		double total=0;

		if(billAmount > 5000) {
			discount = 0.5;
		}
		else if(billAmount > 2000) {
			discount = 0.2;
			
		}
		else if(billAmount > 1000) {
			discount = 0.15;
			
		}
		else {
			System.out.println("No discounts");
		}
		System.out.println("discount is "+discount);
		total = billAmount * discount;
		System.out.println("Discount price is "+total);
	}

}
