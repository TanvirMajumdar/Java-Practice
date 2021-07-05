package operators_NumbersPractice;

/*Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.*/

public class IncrementVariousWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=100;
		x=x++;
		System.out.println(x);
		x=x+1;
		System.out.println(x);
		x+=1;
		System.out.println(x);
		++x;
		System.out.println(x);
		

	}

}
