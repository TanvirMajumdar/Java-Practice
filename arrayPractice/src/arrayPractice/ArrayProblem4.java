package arrayPractice;

/*Write a program that creates an integer array with 5 elements (i.e., numbers). 
The numbers can be any integers.  
Print out the value at the first index and the last index using length - 1 as the index. 
Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  
Notice the type of exception which is produced. Now try to assign a value to the array index 5. 
You should get the same type of exception.*/

public class ArrayProblem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4,5};
		
		System.out.println("The first index: " + arr[0]);
		System.out.println("The last index: " + arr[arr.length-1]);
		System.out.println(arr[arr.length]);
	}

}
