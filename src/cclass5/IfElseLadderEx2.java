package cclass5;

public class IfElseLadderEx2 {

	public static void main(String[] args) {
		
		// if signal is red then print STOP, if signal is yellow then print Get ready, if signal is green then print You can go
		
		String signal = "blue";
		
		if(signal=="red") {
			System.out.println("STOP");
		}
		else if(signal == "yellow") {
			System.out.println("Get ready");
		}
		else if(signal == "green")
		{
			System.out.println("You can go");
		}
		else {
			System.out.println("Input is invalid");
		}

	}

}
