package loopPractice;

/*Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.*/

public class WhileLoopToPrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 0;
		
		while(number<=100)
		{
			System.out.println(number);
			number+=10;
		}

	}

}
