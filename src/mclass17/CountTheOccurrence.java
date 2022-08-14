package mclass17;

public class CountTheOccurrence {

	public static void main(String[] args) {
		//check if target string is present in the string s
		// count the occurrence of target string
		String s = "I am a student. I will learn Java. I will also learn Testing";
		String target = "";
		int count=0;

		if(s.contains(target)) {
			
			String wordsArray[] = s.split(" ");
			for(int i=0; i<wordsArray.length ;i++) {
				
				if(wordsArray[i].equals(target)) {
					count++;
				}
			}
			
			System.out.println("Count of "+target+" = "+count);
		}
		else {
			
			System.out.println("Word is absent and count ="+count);
		}
	}

}
