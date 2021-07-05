package operators_NumbersPractice;


/*Write a program that declares an integer a variable x and assigns the value 2 to it 
and prints out the binary string version of the number ( Integer.toBinaryString(x) ). 
Now, use the left shift operator (<<) to shift by 1 and assign the result to x. 
Before printing the results, write a comment with the predicted decimal value and binary string. 
Now, print out x in decimal form and in binary notation.
Do the preceding exercise with the following values:

    9
    17
    88*/


public class LeftShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1= 2;
		System.out.print("The binary string version of 2: ");
		System.out.println(Integer.toBinaryString(x1));
		x1=x1<<1;
		System.out.print("The decimal value after using the left shift operator (<<) to shift by 1: ");
		System.out.println(x1);
		System.out.println(Integer.toBinaryString(x1)+"\n");
		
		
		int x2= 9;
		System.out.print("The binary string version of 9: ");
		System.out.println(Integer.toBinaryString(x2));
		x2=x2<<1;
		System.out.print("The decimal value after using the left shift operator (<<) to shift by 1: ");
		System.out.println(x2);
		System.out.println(Integer.toBinaryString(x2)+"\n");
		
		int x3= 17;
		System.out.print("The binary string version of 17: ");
		System.out.println(Integer.toBinaryString(x2));
		x3=x3<<1;
		System.out.print("The decimal value after using the left shift operator (<<) to shift by 1: ");
		System.out.println(x3);
		System.out.println(Integer.toBinaryString(x3)+"\n");
		
		int x4= 88;
		System.out.print("The binary string version of 88: ");
		System.out.println(Integer.toBinaryString(x4));
		x4=x4<<1;
		System.out.print("The decimal value after using the left shift operator (<<) to shift by 1: ");
		System.out.println(x4);
		System.out.println(Integer.toBinaryString(x4)+"\n");

		

	}

}
