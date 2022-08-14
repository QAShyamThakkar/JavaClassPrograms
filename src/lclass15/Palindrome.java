package lclass15;

public class Palindrome {

	public static void main(String[] args) {
		//if num is equal to rev num then it is a palindrome
		
		int num = 1231;    
		int lastDigit = 0;
		int revNum = 0;
		int originalNum = num;     //1231
		
		while(num!=0) {
			lastDigit = num%10;  
			revNum = revNum * 10 + lastDigit;
			num = num/10;     
		}
		
		System.out.println("Reverse number= "+revNum);
		System.out.println("Number = "+num);
		System.out.println("Original number= "+originalNum);
		
		if(originalNum==revNum) {
			System.out.println("It is a pallindrome");
		}else {
			System.out.println("It is not a pallindrome");
		}
		
	}

}
