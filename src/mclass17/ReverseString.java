package mclass17;

public class ReverseString {

	public static void main(String[] args) {
		//Reverse the string cat -> tac
		
		// check if string is a palindrome madam -> madam
		// aabbaa -> aabbaa
		
		String s = "Sprintqa";
		String reverseString = "";
		
		for(int i=s.length()-1; i>=0 ; i--) {
			reverseString = reverseString+ s.charAt(i);
			  
		}
		
		System.out.println("Original String "+s);
		System.out.println("Reverse string "+reverseString);
		
		if(s.equals(reverseString)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	
	}

}
