package arrayPractice;

/*Write a program that returns the middle element in an array. 
Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7*/

public class ArrayProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {13, 5, 7, 68, 2};
		
		if(arr.length%2==0)
		{
			System.out.println(arr[arr.length/2]);
			System.out.println(arr[arr.length/2+1]);
		}
		else
		{
			System.out.println(arr[arr.length/2]);
		}
		
	}

}
