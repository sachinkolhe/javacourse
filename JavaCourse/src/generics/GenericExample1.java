package generics;

import java.util.ArrayList;

public class GenericExample1 {
	
	class Stack<T> {
		private T value;
//		push();
//		
//		pop();
	}
	

    public static void main(String[] args) {
        // Using the generic class with Integer
//    	Box<Double> doubleBox = new Box<>();
//    	doubleBox.set(20d);
//    	System.out.println("Double value: " + doubleBox.get());
//
//    	Box<Integer> integerBox = new Box<>();
//        integerBox.set(123);
//        System.out.println("Integer value: " + integerBox.get());
//
//        // Using the generic class with String
//        Box<String> stringBox = new Box<>();
//        stringBox.set("Hello Generics");
//        System.out.println("String value: " + stringBox.get());
        
        
        GenericExample1 example = new GenericExample1();

//        Integer[] intArray = {1, 2, 3, 4};
//        String[] stringArray = {"Hello", "World"};
//
//        example.printArray(intArray); // Prints Integer array
//        example.printArray(stringArray); // Prints String array
        
        
        example.printNumber(123); // Integer
        example.printNumber(45.67); // Double
        
        example.printAnything("23"); // String
        example.printAnything(23); //Integer
    }
    
    
    public <T> void printArray2(T[] arr) {
    	
    }
    
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    
    
    public <T extends Number> void printNumber(T number) {
        System.out.println("Number: " + number);
    }
    
    public <T> void printAnything(T number) {
        System.out.println("Any Type: " + number);
    }
    
}

 class Box<T> {
    private T value;//instance variable

    public void set(T value) { //setter value
        this.value = value;
    }

    public T get() {//getter
        return value;
    }

}
 
