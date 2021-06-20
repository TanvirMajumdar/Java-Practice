package arrayPractice;

/*Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.*/

public class ArrayProblem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1,2,3,4,5};
		
		if(arr.length%2==0)
		{
			for(int i=0; i<arr.length;i++)
			{
				if(i!=(arr.length)/2&&i!=(arr.length)/2+1)
					System.out.println(arr[i]);
				
			}
		}
		else
		{
			for(int i=0; i<arr.length;i++)
			{
				if(i!=arr.length/2+1)
					System.out.println(arr[i]);

			}
		}
	}

}
