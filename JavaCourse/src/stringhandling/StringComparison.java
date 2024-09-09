package stringhandling;

public class StringComparison {

	public static void main(String[] args) {

		  //String Constant Pool: String literal
        //Java Heap Memory: creating an String Object
		
		ex3();
		
		
	}
	/**
	 * == checks the reference
	 * .equals checks the actual value
	 * */
	
	/**
	 * String Constant Pool: special memory which is allocated for string only.
	 * 
	 * String literals are getting saved.
	 * 
	 * If same string occurrs, then it will not create a different string object.
	 * it will point to same reference.
	 * 
	 * StringConstantPool:
	 * 
	 * "password123" <--------- prathmesh
	 *  "password1"		<----------------- ajay
	 * 
	 * "hello" <------- str1
	 * 		^--------- str2
	 * 
	 * "pune" <---------str4
	 * "abc"
	 * "hello2" <------- str2
	 * 
	 * Java Heap Memory: where all objects are stored. Person per = new Person();
	 * 
	 * String str = new String("Hello");
	 * 
	 * object "hello" : 5000 <---------- str1
	 * object "hello" : 10000 <---------- str2
	 * 
	 * String Constant Pool:
	 * String str = "hello";
	 * 
	 * 
	 * 
	 * */
	


	    public static  void ex1() {
	        // String literals
	    	// new String("hello"); Heap
	        String str1 = "hello";
	        String str2 = "hello";

	        System.out.println("String literal comparison:");
	        System.out.println("str1 == str2: " + (str1 == str2)); // true, same reference due to string pooling
	        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
	    }

	   

	        public static  void ex2() {
	            // String objects created with new
	            String str1 = new String("hello");//Java Heap Memory and address would be 5000
	            String str2 = new String("hello");//Java Heap Memory and address would be 10000

	            System.out.println("String object comparison:");
	            System.out.println("str1 == str2: " + (str1 == str2)); // false, different references
	            System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
	        }
	    
	       

	            public static void ex3() {
	                // Interning strings
	                String str = new String("hello");//Java Heap Memory
	                String str1 = str.intern();//intern. it will create a object into string constant pool.
	                String str2 = "hello";//String literal

	                System.out.println("str == str1 " + (str == str1));
	                System.out.println("Interned string comparison:");
	                System.out.println("str1 == str2: " + (str1 == str2)); // true, same reference due to interning
	                System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, same content
	            }
	            /***
	             * String str = new String("hello"); //Java Heap Memory
	             * object "hello" <--------- str
	             * .intern();
	             * 
	             *  SCP:
	             *  "hello" <--------- str1
	             *    		<---------------- str2  
	             * 
	             * 
	             * */
	        




}
/**
 * == Operator: Compares if two references point to the same object in memory. 
 * It does not compare the actual content of the objects.

.equals() Method: Compares the content or state of the objects. 
For String, it checks if the sequences of characters are identical.

String Pooling: Strings created with literals are automatically interned 
and point to the same reference if they have the same value. 
Strings created with new are not interned unless explicitly done so with .intern().
 * */
