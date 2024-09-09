package inheritance.methodoverride;

public class AccessModifier {

	public static void main(String[] args) {
//		    Animal myAnimal = new Animal();      
//	        myAnimal.makeSound(); // Calls method from Animal class
	     
//		Dog dog = new Dog();
//		dog.makeSound();
		
		//Parent p = new Child();
		Animal myDog = new Dog();
        //ParentClass reference= new BaseClass();
        //parentClass is holding a reference of baseClass
		myDog.makeSound();    // Calls overridden method from Dog class

	}
	
	//compile time and run time
	//Note: Parent p = new Child();
	//p.methodName()
	//at the time of compilation it checks Parent has methodName
	//at the time of execution run-time it checks/calls Child methodName

}
class Animal {
    // Method to be overridden
     void makeSound() {
        System.out.println("Animal makes a sound");
        
        this.makeSound2(10);
    }
    //method signature
    //methodName + arguments (dataType or number of arguments)
    
    private void makeSound2(int x) {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
//    private void makeSound3(int x) {
//    	super.makeSound2(x);
//    }
}

//public private protected default

/**
 * Interview Questions:
 * 
 * 1. if superClass method has `public` access modifier then in subClass method while overriding only public is allowed. 
 * all other access are more restrictive than public.
 * 
 * 2. in case of `private`. private is considered to be visible in the same class itself.
 * it is not accessible through inheritance as well.
 * 
 * 3. in case of `protected`, public + protected access modifier is allowed
 * 
 * 4. in case of `default` access modifier, public + protected + default access modifier is allowed 
 * 
 * **/

/**
 * Summary:
 * `public` is more visible than any other access modifier
 * `priavte` is more restrictive than any other access modifier
 * 
 * */






