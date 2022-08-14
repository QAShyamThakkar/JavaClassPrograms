package mclass17;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "aaabbbccc";
		// Output should be aaa, bbb, ccc
		
		int i=0;
		while(i<9) {
			System.out.println(s.substring(i,i+3));
			i = i+3;
		}
	}
	

}
