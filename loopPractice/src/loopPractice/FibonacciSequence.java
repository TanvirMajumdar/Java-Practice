package loopPractice;
/*Write a program that prints the Fibonacci Sequence from 0 to 50. 
The following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a = 0, b = 1, c=0;
        System.out.println(a);
        while (c<=50)
        {
            c = a + b;
            a = b;
            b = c;
            System.out.println(a);
        }
        
        

	}

}
