package com.perscholas.java_basics;

/*Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?*/

public class JavaBasicClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstInteger1 = 15;
		int secondInteger1 = 10;
		int division1= firstInteger1/secondInteger1;
		
		System.out.println(division1);
		
		
		double firstInteger2 = 15.0;
		int secondInteger2 = 10;
		double division2= firstInteger2/secondInteger2;
		
		System.out.println(division2);

	}

}
