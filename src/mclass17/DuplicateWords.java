package mclass17;

public class DuplicateWords {

	public static void main(String[] args) {
		//Print only duplicate words
		String s = "I will learn coding. I will learn Java";
		
		String target;
		
		String wordsArray[] = s.split(" ");
		
		for(int i=0; i<wordsArray.length ;i++) {
			
			target = wordsArray[i];
			for(int j=i+1;j<wordsArray.length;j++) {
		
				if(wordsArray[j].equals(target)) {
					System.out.println(target);
				}
			}	
		}
		
	}

}
