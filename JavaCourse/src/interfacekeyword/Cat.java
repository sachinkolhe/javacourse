package interfacekeyword;

public class Cat implements Animal {

	 @Override
	    public void eat() {
	        System.out.println("Cat is eating.");
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Cat meows.");
	    }

}
