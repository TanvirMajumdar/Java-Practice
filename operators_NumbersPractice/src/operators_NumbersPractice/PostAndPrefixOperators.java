package operators_NumbersPractice;


/*Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. 
Create another variable sum and assign the value of ++x added to y and print the result. 
Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. 
Notice what the value of sum is. 
The first configuration incremented x and then calculated the sum while the second configuration 
calculated the sum and then incremented x.*/


public class PostAndPrefixOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		System.out.println("Value of integer x: "+ x);
		int y=8;
		System.out.println("Value of integer y: "+ y);
		++x;
		int sum=x+y;
		System.out.println("Summation of x and y after doing ++x: "+ sum);
		x++;
		sum=x+y;
		System.out.println("Summation of x and y after doing x++: "+ sum);

	}

}
