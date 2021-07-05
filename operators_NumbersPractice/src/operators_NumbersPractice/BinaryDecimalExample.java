package operators_NumbersPractice;


/*Convert the following binary numbers to decimal notation. 
Do not use any Java functions or online conversion applications 
to calculate the answer as this will hinder the learning process and your understanding of the concept. 
However, you may check your answers using Java methods.
    0010
    1001
    0011 0100
    0111 0010
    0010 0001 1111
    0010 1100 0110 0111*/


public class BinaryDecimalExample {
	
    static long binaryToDecimal(String n)
    {
        String num = n;
        int dec_value = 0;
 
        // Initializing base value to 1,
        // i.e 2^0
        int base = 1;
 
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
 
        return dec_value;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String num1 = new String("0010");
        System.out.println(binaryToDecimal(num1));
        
        String num2 = new String("1001");
        System.out.println(binaryToDecimal(num2));

        String num3 = new String("00110100");
        System.out.println(binaryToDecimal(num3));

        String num4 = new String("01110010");
        System.out.println(binaryToDecimal(num4));

        String num5 = new String("001000011111");
        System.out.println(binaryToDecimal(num5));

        String num6 = new String("0010110001100111");
        System.out.println(binaryToDecimal(num6));


	}

}
