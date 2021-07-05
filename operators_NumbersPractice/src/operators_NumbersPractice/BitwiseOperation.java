package operators_NumbersPractice;


/*Write a program that declares 3 int variables x, y, and z. Assign 7 to x and 17 to y. 
Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y. 
Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. 
As before, write a comment that indicates what you predict the values to be before printing them out.*/

public class BitwiseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		int z;
		
		x=7;
		y=17;
		
		System.out.print("The binary string version of 7: ");
		System.out.println(Integer.toBinaryString(7));
		System.out.print("The binary string version of 17: ");
		System.out.println(Integer.toBinaryString(17));
		
		z=(x&y);
		System.out.println("The result after using bitwise & operator: "+ Integer.toBinaryString(z));
		
		z=(x|y);
		System.out.println("The result after using bitwise | operator: "+ Integer.toBinaryString(z));
		

	}

}
