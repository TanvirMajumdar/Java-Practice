package loopPractice;

/*Write a program that returns all the available palindromes within 10 and 200. The following output will be produced:

11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191*/

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=10;
		
		for(; number<=200; number++)
		{
			int reverse=0;
			int temp =number;
			
		    while(temp != 0)
		    {
		      reverse = reverse * 10;
		      reverse = reverse + temp%10;
		      temp = temp/10;
		    }
					
			if(number==reverse)
				{
					System.out.println(number);
				}


		}

	}

}
