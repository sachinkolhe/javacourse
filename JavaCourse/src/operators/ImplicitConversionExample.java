package operators;

public class ImplicitConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 10;
        double doubleValue = intValue; // Automatic conversion from int to double
        System.out.println("Double value: " + doubleValue);
        
        byte b = 2;
        
        short c = b;
        System.out.println("Short can accept byte datatype variable as well that is" + c);

	}

}
