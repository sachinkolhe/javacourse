package inheritance.constructor.chaining;

public class ConstChainWithInitBlocks {

	public static void main(String[] args) {
		  System.out.println("Creating DerivedClass instance with no arguments:");
	        new DerivedClass(); // Create an instance of DerivedClass

	        System.out.println("\nCreating DerivedClass instance with an argument:");
	        new DerivedClass(5); 
	}
	
	//static called when class is getting loaded into memory
	//then object creation starts

	//static of all class
	//constructor: implict call super class constructo
	//constructor:- precheck init block 
	
	//step 1 : static of all class super class to base class
	//step 2 : init - constructo of each class superclass to base class
	
}
class BaseClass {
	//static init block
    static {
        System.out.println("BaseClass static initialization block");
    }

    //init block
    {
        System.out.println("BaseClass instance initialization block");
    }

    //default constructor
    BaseClass() {
        System.out.println("BaseClass no-argument constructor");
    }

    //paramterized constructor
    BaseClass(int x) {
        System.out.println("BaseClass constructor with argument: " + x);
    }
}

class IntermediateClass extends BaseClass {
	//static init
    static {
        System.out.println("IntermediateClass static initialization block");
    }

    //init block
    {
        System.out.println("IntermediateClass instance initialization block");
    }

    //default cons
    IntermediateClass() {
        super(); // Calls BaseClass no-argument constructor
        System.out.println("IntermediateClass no-argument constructor");
    }

    IntermediateClass(int x) {
        super(x); // Calls BaseClass constructor with argument
        System.out.println("IntermediateClass constructor with argument: " + x);
    }
}

class DerivedClass extends IntermediateClass {
    static {
        System.out.println("DerivedClass static initialization block");
    }

    {
        System.out.println("DerivedClass instance initialization block");
    }

    DerivedClass() {
//        super(); // Calls IntermediateClass no-argument constructor
        System.out.println("DerivedClass no-argument constructor");
    }

    DerivedClass(int x) {
        super(x); // Calls IntermediateClass constructor with argument
        System.out.println("DerivedClass constructor with argument: " + x);
    }
}


/***
 * 
 * Order of Execution:
 * Static blocks are executed first (once per class loading).
 * Instance initialization blocks are executed before the constructor code of the class itself.
 * Constructors are executed in the order of class hierarchy from superclass to subclass.
 * 
 * 
 * */
