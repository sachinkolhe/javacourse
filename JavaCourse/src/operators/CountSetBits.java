package operators;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 29;
		
		String numBinary = Integer.toBinaryString(num);
		
		System.out.println(numBinary);
		
	    int originalNumber = num;
	    int count = 0;
	    while (num > 0) {
	        count = count + (num & 1); 
	        num >>= 1; 
	    }
	    System.out.println("Number of set bits in " + originalNumber + " is: " + count);
	    
	}

	
}
