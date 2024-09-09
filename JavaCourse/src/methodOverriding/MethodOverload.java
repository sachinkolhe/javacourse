package methodOverriding;

public class MethodOverload {

	public static void main(String[] args) {
		MathOperations mathOp = new MathOperations();
		int x = mathOp.add(3L);
		System.out.println("Output of this operation is "+ x);

	}

}

/**
 * Compile time polymorphism: at the time of compilation. it checks which method to call
 * Two principles to consider while method overloading
 * 1. same function name with different number of paramter
 * 2. same function name with different data type of the same number of parameters
 * */

/*
 * Different Parameter List: The overloaded methods must differ in the number or type of parameters.
 * */
class MathOperations {
	
	private int dataX;//instance variable
	private double dataY;
	
	//basics of constructor
	//1. it should not have return type
	//2. it should have same name what we have given for the class name
	public MathOperations() {
		
	}
	
	//method
	public void MathOperations() {
		
	}

	public MathOperations(int x) {
		this.dataX = x;
	}
	
	public MathOperations(double y) {
		this.dataY = y;
	}
	
	
    // Method with one integer parameter
    public int add(int a) {
        return a + a;
    }
    
    public int add(long a) {
        return Math.toIntExact(a + a);
    }

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with one double parameter
    protected double add(double a) {
        return a + a;
    }
}

/*
 * Different Parameter Types: Overloaded methods can have parameters of different types.
 * */

 class Printer {
    // Method with an integer parameter
    public void print(int value) {
        System.out.println("Integer: " + value);
        
    }
    
    //not a case of method overloading
    protected long print(long value) {
        System.out.println("Integer: " + value);
        return value;
    }

    // Method with a string parameter
    protected void print(String value) {
        System.out.println("String: " + value);
    }
}
 
 /*
  * Different Number of Parameters: Overloaded methods can differ in the number of parameters.
  * */
 class Concatenator {
	    // Method with two string parameters
	    public String concatenate(String a, String b) {
	        return a + b;
	    }

	    // Method with three string parameters
	    public String concatenate(String a, String b, String c) {
	        return a + b + c;
	    }
	}
 
 /*
  * Static Methods: Overloading can also apply to static methods. 
  * Static method overloading follows the same rules as instance method overloading.
  * */
  class StaticExample {
	    // Static method with different parameters
	    public static void display(int a) {
	        System.out.println("Integer: " + a);
	    }

	    public static void display(String a) {
	        System.out.println("String: " + a);
	    }
	}




