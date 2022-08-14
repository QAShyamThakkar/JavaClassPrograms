package cclass5;

public class IfElseLadderEx5 {

	public static void main(String[] args) {
		
		// a = 20,b =10
		//char input + , - , *, /
		//if + -> a + b 
		// if - -> a-b
		//if * -> a*b
		//if / -> a/b
		
		int a=20, b=10;
		char input = '$';
		int result;
		
		if(input == '+') {
			result = a+b;
			System.out.println(result);
		}
		else if(input == '-') {
			result = a-b;
			System.out.println(result);
		}
		else if(input == '*') {
			result = a*b;
			System.out.println(result);
		}
		else if(input == '/') {
			result = a/b;
			System.out.println(result);
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
