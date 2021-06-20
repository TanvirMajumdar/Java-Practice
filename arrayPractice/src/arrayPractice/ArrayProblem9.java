package arrayPractice;

import java.util.Arrays;

/*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13*/

public class ArrayProblem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {4, 2, 9, 13, 1, 0};
		
		for(int i=0; i<arr.length-1; i++)
		{
			
			for(int j=0; j<arr.length-1; j++)
			{
				
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println("The smallest number: "+ arr[0]);
		System.out.println("The biggest number: "+ arr[arr.length-1]);

	}

}
