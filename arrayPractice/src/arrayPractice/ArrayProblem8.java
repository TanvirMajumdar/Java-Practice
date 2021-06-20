package arrayPractice;

import java.util.Arrays;

/*Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.*/

public class ArrayProblem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5};
		
		
		System.out.println("Array before swapping: "+ Arrays.toString(arr));
		
		int temp= arr[0];
		arr[0]=arr[arr.length/2];
		arr[arr.length/2]= temp;
		
		System.out.println("Array after swapping: "+ Arrays.toString(arr));
		

	}

}
