package com.perscholas.java_basics;

/*Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. 
Now, cast y to a double and assign to q. Print q again.*/

public class JavaBasicClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 5;
		int y=6;
		double q= y/x;
		
		System.out.println("The division of " + x +" and " + y +" is: " + q);
		
		q=(double)y/x;
		
		System.out.println("The division of " + x +" and " + y +" is: " + q);


	}

}
