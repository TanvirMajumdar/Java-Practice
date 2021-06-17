package getterSetterDemo;

import java.util.Scanner;

public class Runner{
	
	public static void main(String[] args) {
		Employee po =new Employee(0, null, 0);
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Give employee Id: ");
		po.setEmployeeId(scan.nextInt());
		System.out.println("Give employee First Name: ");
		po.setEmployeeName(scan.next());
		System.out.println("Give employee Age: ");
		po.setEmployeeAge(scan.nextInt());
		scan.close();
		

		System.out.println(po.toString());
		
	}
}



