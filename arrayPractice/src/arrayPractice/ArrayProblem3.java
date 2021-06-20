package arrayPractice;

import java.util.Arrays;

/*Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. 
Print out the array length. 
Make a copy using the clone( ) method. 
Use the Arrays.toString( ) method on the new array to verify that the original array was copied.*/

public class ArrayProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1= new String[]{"red", "green", "blue", "yellow"}; 
				
		System.out.println("Array Length: " + arr1.length);
		
		String[] arr2 = new String[4];
		
		arr2= arr1.clone();
		
		System.out.println(Arrays.toString(arr2));
	}

}
