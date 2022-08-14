package eclass7;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		//based on the time of the day // Print greetings GM, GE,GN
		
		String time="afternoon";
		
		switch(time) {
		case "morning":
			System.out.println("Good morning");
			break;
		case "evening":
			System.out.println("Good evening");
			break;
		case "night":
			System.out.println("Good night");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
