package controlFlowStatementsPractice;

import java.util.Scanner;

/*Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: <60
Use the Scanner class to accept a number score from the user to determine the letter grade. 
Print out “Score out of range.” if the score is less than 0 or greater than 100.*/

public class ControlFlowStatementsPractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner result= new Scanner (System.in);
		int x = result.nextInt();

		if(x>=90 && x<=100){
		    System.out.println("A");
		}
		else if(x>=80 && x<89){
		    System.out.println("B");
		}
		else if(x>=70 && x<79){
		    System.out.println("C");
		}
		else if(x>=60 && x<69){
		    System.out.println("D");
		}
		else if(x<60){
		    System.out.println("F");
		}
		else if(x>100 || x<0){
		    System.out.println("Score out of range");
		}
		
		result.close();

	}

}
