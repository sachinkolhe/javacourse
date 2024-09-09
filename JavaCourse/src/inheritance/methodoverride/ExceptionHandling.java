package inheritance.methodoverride;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	 public static void main(String[] args) {
	        try {
	            Parent1 p = new Child1();
	            p.process(); // Calls Child's process method
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}

class Parent1 {
    // Method that throws a checked exception
    public void process() throws IOException {
        System.out.println("Parent processing");
    }
}

class Child1 extends Parent1 {
    // Overriding method can throw the same or subclass of the exception
    @Override
    public void process() throws FileNotFoundException {
        System.out.println("Child processing");
    }
}



