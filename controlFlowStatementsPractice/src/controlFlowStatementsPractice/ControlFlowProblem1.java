package controlFlowStatementsPractice;

/*Write a program that declares 1 integer variable x, and then assigns 7 to it.
Write an if statement to print out “Less than 10” if x is less than 10. 
Change x to equal 15 and notice the result (console should not display anything).
*/
public class ControlFlowProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=7;
		if (x<10){
		  System.out.println("Less than 10");
		  
		x=15;
		if (x<10){
		  System.out.println("Less than 10");

		}

	}
}
}
