package kclass14;

public class ArrayEx {

	public static void main(String[] args) {
		// store marks for 4 students
		
		int studentMarks[] = new int[4];
		
		studentMarks[0] = 12;
		studentMarks[1]  = 20;
		studentMarks[2] = 45;
		studentMarks[3] = 18;
		
		for(int i=0; i< studentMarks.length ; i++ ) {
			System.out.println(studentMarks[i]);
		}
		
		int len = studentMarks.length;
		System.out.println("Array length = "+len);

	}

}
