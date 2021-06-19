package loopPractice;

/*Write a program that uses a for-loop to loop through the numbers 1-100. 
Print out each number if is a multiple of 5, 
but do not print out any numbers greater than 50. Use the “break” keyword to accomplish this.
*/
public class ForLoopPracticeWithCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1;
		
		for(; number<=100; number++)
		{
			if (number>=50)
			{
				break;
			}
			else if (number%5==0)
			{
				System.out.println(number);
			 }
			}

		}

}
