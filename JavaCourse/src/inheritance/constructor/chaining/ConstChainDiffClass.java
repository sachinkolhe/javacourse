package inheritance.constructor.chaining;

public class ConstChainDiffClass {
	/***
	 * 1. Automatic Call to Superclass Constructor: Implicit Call
	 * 2. Explicit Call to Superclass Constructor:
	 * 3. Chaining Within the Same Class: 
	 * 4. Constructor Chaining Order: the constructor of the superclass is called first 
	 * 		(either implicitly or explicitly), followed by the constructor of the current class.
	 * 5. Constructor Chaining and Initialization Blocks
	 * */
	//Inheritance : is-a relationship
	//Dog is-a Animal
	//subClass is-a parentClass

	public static void main(String[] args) {
		 
		        Dog dog = new Dog("Buddy", "Golden Retriever"); // Calls both constructors
		        dog.display();
		    
	}

}

class Animal {
	//field
    private String name;

    //default cons
//    public Animal(){
//    	System.out.println("Animal Default Constructor called");
//    }
    // paramter cons
    // Superclass constructor
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal Parametrized constructor called");
    }

    //method 
    public void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {
	
	//field
    private String breed;
    
    //default cons
//    public Dog(){
//    	System.out.println("Dog Constructor");
//    }

    //param con
    // Subclass constructor
    public Dog(String name, String breed) {
        //java's implicit call to super class default constructor
    	super(name); // Calls Animal's constructor
        this.breed = breed;
        System.out.println("Dog Paremeter constructor called");
    }

    //overrided method
    @Override
    public void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }

   
}

