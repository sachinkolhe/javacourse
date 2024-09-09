package interfacekeyword;

public interface MyInterface {

    // Constant declaration
    public static final int CONSTANT = 10; //public static final means constants. we cannot change it.

    // Abstract method
     void abstractMethod(); //these are implicitly public abstract methods.

//     void abstractMethod2();
     
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method. inside interface.");
    }

    // Static method utilit method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
// legacy old product: 100 classes implementing one interface

/**
 * 1. create an interface using `interface` keyword
 * 
 * 2. declare an variable is possible inside interface. but they are constants.
 * 
 * 3.
 * 
 * */
