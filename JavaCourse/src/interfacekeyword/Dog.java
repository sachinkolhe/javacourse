package interfacekeyword;

public class Dog implements Animal {

	 @Override
	    public void eat() {
	        System.out.println("Dog is eating.");
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Dog barks.");
	    }

}
