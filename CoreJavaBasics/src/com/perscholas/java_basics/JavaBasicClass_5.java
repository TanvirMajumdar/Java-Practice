package com.perscholas.java_basics;

/*Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable. 
Print out the result. Now, cast the result to an integer. Print out the result again.*/

public class JavaBasicClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double firstVariable= 25.0;
		double secondVariable= 10.0;
		
		double sum= firstVariable+secondVariable;
		
		int integerSum = (int) sum;
		
		System.out.println("The sum of " + firstVariable +" and " + secondVariable +" is: " + sum);
		System.out.println("The sum of " + firstVariable +" and " + secondVariable +" is: " + integerSum);

	}

}
