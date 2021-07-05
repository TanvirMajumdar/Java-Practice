package operators_NumbersPractice;

/*Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number.
Now use the right shift operator (>>) to shift by 2 and assign the result to x. 
Write a comment indicating what you anticipate the decimal and binary values to be. 
Now print the value of x and the binary string.
Do the preceding exercise with the following values:

    225
    1555
    32456
*/

public class RightShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1= 150;
		System.out.print("The binary string version of 150: ");
		System.out.println(Integer.toBinaryString(x1));
		x1=x1>>2;
		System.out.print("The decimal value after using the right shift operator (>>) to shift by 2: ");
		System.out.println(x1);
		System.out.println(Integer.toBinaryString(x1)+"\n");
		
		
		int x2= 225;
		System.out.print("The binary string version of 225: ");
		System.out.println(Integer.toBinaryString(x2));
		x2=x2>>2;
		System.out.print("The decimal value after using the right shift operator (>>) to shift by 2: ");
		System.out.println(x2);
		System.out.println(Integer.toBinaryString(x2)+"\n");
		
		int x3= 1555;
		System.out.print("The binary string version of 1555: ");
		System.out.println(Integer.toBinaryString(x2));
		x3=x3>>2;
		System.out.print("The decimal value after using the right shift operator (>>) to shift by 2: ");
		System.out.println(x3);
		System.out.println(Integer.toBinaryString(x3)+"\n");
		
		int x4= 32456;
		System.out.print("The binary string version of 32456: ");
		System.out.println(Integer.toBinaryString(x4));
		x4=x4>>2;
		System.out.print("The decimal value after using the right shift operator (>>) to shift by 2: ");
		System.out.println(x4);
		System.out.println(Integer.toBinaryString(x4)+"\n");

	}

}
