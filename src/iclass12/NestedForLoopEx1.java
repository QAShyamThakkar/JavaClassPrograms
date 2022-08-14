package iclass12;

public class NestedForLoopEx1 {

	public static void main(String[] args) {
		
		// Week1 -> day1 day2 day3 .... day7
		// Week2 -> day1 day2 day3 .... day7
		// Week3 -> day1 day2 day3 .... day7
		
		for(int i=1;i<=3;i++) {
			System.out.print("Week "+i+" -> ");
			
			for(int j=1;j<=7;j++) {
				System.out.print("Day "+j+" ");
			}
			System.out.println();
		}
		
	}

}
