package iclass12;

public class NestedEx5 {

	public static void main(String[] args) {
		//11111
		//2222
		//333
		//44
		//5
		
		for(int i=1;i<=5 ;i++) {
			
			for(int j=5; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
