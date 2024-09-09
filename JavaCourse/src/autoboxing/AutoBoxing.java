package autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {


    public static void main(String[] args) throws NumberFormatException{
        // Autoboxing: converting primitive int to Integer
    	
    	String strAsNumber = "20s";
    	int num = Integer.parseInt(strAsNumber);
    	System.out.println("Number is "+num);
    	
//        int primitiveInt = 10;
//        Integer wrapperInt = primitiveInt; // Autoboxing
//        System.out.println("Wrapper Integer: " + wrapperInt);
//
//        // Unboxing: converting Integer to primitive int
//        Integer anotherWrapperInt = new Integer(20);
//        
//        int anotherPrimitiveInt = anotherWrapperInt; // Unboxing
//        System.out.println("Primitive int: " + anotherPrimitiveInt);
//
//        // Using autoboxing with Collections
//        List<Integer> intList = new ArrayList<>();
//        intList.add(5); // Autoboxing happens here
//        intList.add(10);
//
//        // Iterating over the list
//        for (Integer number : intList) {
//            System.out.println("Number: " + number); // Unboxing happens here
//        }
    
    	// <Integer>
    	
    }
}

