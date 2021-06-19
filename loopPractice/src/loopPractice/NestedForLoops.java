package loopPractice;

/*Write a program that uses nested for-loops to output the following:
Week 1:
		Day 1
		Day 2
		Day 3
		Day 4
		Day 5

Week 2:
		Day 1
		Day 2
		Day 3
		Day 4
		Day 5*/


public class NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weeksNumber=1;
		
		for (;weeksNumber<=2;weeksNumber++)
		{
			System.out.println("Week "+ weeksNumber + ":");
			
			int daysNumber=1;			
			for(;daysNumber<=5;daysNumber++)
			{
				System.out.println("     Day "+ daysNumber);
			}
		}

	}

}
