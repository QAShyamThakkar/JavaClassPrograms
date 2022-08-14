package dclass6;

public class NestedIfEx2 {

	public static void main(String[] args) {
		
		// if username is test
			// if password is test123
				// Login successful
			// Password incorrect
		//username incorrect
		
		String username = "test";
		String password = "test123";

		if(username == "test") {
			
			if(password == "test123") {
				System.out.println("1.Login is successful");
			}else {
				System.out.println("2.Password is incorrect");
			}
			
		}
		else {
			System.out.println("3.Username is incorrect");
		}
		
	}

}
