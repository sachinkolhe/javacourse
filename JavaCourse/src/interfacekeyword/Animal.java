package interfacekeyword;

public interface Animal {
	void eat();
    void makeSound();
    
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
