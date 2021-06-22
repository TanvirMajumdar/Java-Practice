package com.perscholas.java_basics;

/*Write a program where you create 3 variables that represent products at a cafe. 
 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc. 
 * Assign prices to each product. Create 2 more variables called subtotal and totalSale and 
 * complete an “order” for 3 items of the first product, 4 items of the second product, and 2 items of the third product.
 * Add them all together to calculate the subtotal.
 * Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
 * Be sure to format the results to 2 decimal places. 
 */

public class JavaBasicClass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double SALES_TAX = 0.06;
		
		double coffee= 1.99;
		double cappuccino= 2.99;
		double espresso= 4.99;
		
		double subtotal=0.0;
		double totalSale=0.0;
		
		subtotal= 3*coffee+ 4*cappuccino+ 2*espresso;
		totalSale=subtotal+ subtotal*SALES_TAX;
			
		System.out.printf("Total Sale amount: $"+ "%.2f", totalSale);

	}

}
