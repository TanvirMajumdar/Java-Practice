package operators_NumbersPractice;


/*Write the following integers in binary notation. 
Do not use any Java functions or online conversion applications to calculate the answer as this will hinder the learning process 
and your understanding of the concept. However, you may check your answers using Java methods.
1
8
33
78
787
33,987*/


public class DecimalBinaryExample {
	
	
	  public void convertBinary(int num){
		     int binary[] = new int[40];
		     int index = 0;
		     while(num > 0){
		       binary[index++] = num%2;
		       num = num/2;
		     }
		     for(int i = index-1;i >= 0;i--){
		       System.out.print(binary[i]);
		     }
		  }
		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DecimalBinaryExample obj = new DecimalBinaryExample();
	     System.out.println("Binary representation of 1: ");
	     obj.convertBinary(1);
	     System.out.println("\nBinary representation of 8: ");
	     obj.convertBinary(8);
	     System.out.println("\nBinary representation of 33: ");
	     obj.convertBinary(33);
	     System.out.println("\nBinary representation of 78: ");
	     obj.convertBinary(78);
	     System.out.println("\nBinary representation of 787: ");
	     obj.convertBinary(787);
	     System.out.println("\nBinary representation of 33987: ");
	     obj.convertBinary(33987);

	}

}
