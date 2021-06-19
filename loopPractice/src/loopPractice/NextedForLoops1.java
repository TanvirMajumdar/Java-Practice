package loopPractice;

/*Write a program that nests a for-loop inside another. 
Print out the inner and outer variable (e.g., i or j) 
in the inner loop (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).*/

public class NextedForLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=0;
	
		for (; j<=2; j++) {
			int i=0;
			for (;i<=2;i++) {
				System.out.println("Inner loop: i:" + i + ", j: " + j);
			}
		}

	}

}
