package operators;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";

        // Check if str is an instance of the String class
        boolean result = str instanceof String;
        System.out.println("str instanceof String: " + result); // true

        // Check if str is an instance of the Object class
        result = str instanceof Object;
        System.out.println("str instanceof Object: " + result); // true
        
        
        
	}

}


/***
 * Object
 * Person
 * String
 * 
 * 
 * ***/
