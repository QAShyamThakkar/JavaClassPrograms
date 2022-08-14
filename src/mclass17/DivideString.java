package mclass17;

public class DivideString {

	public static void main(String[] args) {
		
		//Print all words from this string
		 String s = "Good morning how are you" ;
		 
		 String wordsArray[] = s.split(" ");
		 
		 for(int i=0; i<wordsArray.length ; i++) {
			 System.out.println(wordsArray[i]);
		 }
	}

}
