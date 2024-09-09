package operators;

public class EvenOddWithBitwise {

	public static void main(String[] args) {

		
		int x = 9;
		
		String xBinary = Integer.toBinaryString(x);
		System.out.println("Binary String of x="+x+" is "+xBinary);
		
		int y = x & 1;
		if( y == 1){
			System.out.println("Odd Number");
		} else {
			System.out.println("Even Number");
		}
		
	}

}
