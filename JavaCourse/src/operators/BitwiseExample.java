package operators;

public class BitwiseExample {

	public static void main(String[] args) {
		
		  	int a = 5;  // Binary: 0101
	        int b = 3;  // Binary: 0011
	        /***
	         * 32 16 8 4 2 1
	         * 0   0 0 1 0 1 ==> 5
	         * 0   0 0 0 1 1 ==> 3	
	         * --------------------
	         * 	0  0 0 0 0 1 ==> 1 output bitwise AND
	         *  0  0 0 1 1 1 ==> 7 output bitwise OR
	         * ***/

	        String aBinary = Integer.toBinaryString(a);
	        System.out.println("Binary String of a " + a +" is "+aBinary);
	        
	        String bBinary = Integer.toBinaryString(b);
	        System.out.println("Binary String of b " + b +" is "+bBinary);
	        
	        System.out.println("a & b: " + (a & b));   // Bitwise AND: 1 (0001)
	        System.out.println("a | b: " + (a | b));   // Bitwise OR: 7 (0111)
	        System.out.println("a ^ b: " + (a ^ b));   // Bitwise XOR: 6 (0110)
	        System.out.println("~a: " + ~a);           // Bitwise NOT: -6 (Inverted bits)
	        System.out.println("a << 1: " + (a << 1)); // Left shift: 10 (1010)
	        System.out.println("a >> 1: " + (a >> 1)); // Right shift: 2 (0010)
	        System.out.println("a >>> 1: " + (a >>> 1)); // Unsigned right shift: 2 (0010)
	}

}
