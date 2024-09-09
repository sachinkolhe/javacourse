package operators;

public class Scope {
	
	int instanceVar; // instance scope. lifetime is when an 
	//instance of the class is created and destroyed when the object is garbage collected.
	
	static int staticVar; // class scope. lifetime is through out application

	public static void main(String[] args) {
		
	}
	
	public void myMethod() {
	    int localVar = 10; // local scope
	    if (true) {
	        int blockVar = 20; // block scope
	        System.out.println(localVar); // Accessible
	        System.out.println(blockVar); // Accessible
	    }
	    System.out.println(localVar); // Accessible
//	    System.out.println(blockVar); // Not Accessible - Compile-time error
	}
	
	//local scope: inside method
	//block scope: inside any control statement: if-else, for, while, do while
	//instance scope: any variable inside a class without static keyword: object level
		// app starts, program runs
		// created an object>>age, salary: scope and life of instance variable starts
		// object = null; this is eligible for garbage collection
		// object destroyed
	//class scope: 
		// app starts, program runs
		// static variables are created
		// app stops/terminated
	
	

}
