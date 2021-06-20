package arrayPractice;

/*Write a program where you create an integer array with a length of 5.
Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.*/

public class ArrayProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			arr[i]=i;
			System.out.println(arr[i]);
		}

	}

}
