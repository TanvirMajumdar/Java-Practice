package operators_NumbersPractice;

/*Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value. 
Print the value before and after the increment operator.*/

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer x=100;
		System.out.println("The value of an integer before the postfix increment operator: "+ x);
		
		System.out.println("The value of an integer after the postfix increment operator: "+ x++);;
		

	}

}
