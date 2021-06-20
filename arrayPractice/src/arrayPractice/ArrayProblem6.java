package arrayPractice;

/*Write a program where you create an integer array of 5 numbers. 
Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.*/

public class ArrayProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[5];
		
		int i=1;
		
		while(true) {
			if(i>5) {
				break;
				
			}
			else{
				arr[i-1]=i*2;
				System.out.println("i:"+ i + ", array["+ i +"] :" + arr[i-1]);
				i++;
			}
		}

	}

}
