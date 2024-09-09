package inheritance.superkeyword;

public class SuperTest {

	public static void main(String[] args) {
		Dog dog = new Dog();//while creating an object the constructor is getting called.
		//it will check if it has superclass constructor
		dog.displayName();
		dog.makeSound();
	}

}

class Animal {//SUperClass
	
	String name = "Animal Name"; // field
	
	//constructor // doesnt have return type and className is same as Constructor name
	Animal() {
		System.out.println("Animal Constructor");
	}
	
	//method
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
	
	Dog() {
		//super(); implict call to super class constructor
		//super(); //this is an explicit call
		System.out.println("Dog Constructor");
	}
	
    @Override
    void makeSound() {
        super.makeSound(); // Calls the superclass method
        System.out.println("Bark");
    }
    
    void displayName() {
    	System.out.println(super.name);// referring field of super class
    }
}

/**
 * super vs this
 * super refers to the superclass of the current object
 * this refers to the same class of the current object
 * 
 * */
/***
 * super refers to the superclass of the current object and 
 * allows access to superclass methods, fields, and constructors.
 * Method Overriding: Use super to call a method from the superclass that has been overridden in the subclass.
 * Field Shadowing: Use super to access a superclass field that is shadowed by a field in the subclass.
 * Constructor Chaining: Use super() to call the superclass’s constructor from the subclass constructor.
 * 
 * ***/
 