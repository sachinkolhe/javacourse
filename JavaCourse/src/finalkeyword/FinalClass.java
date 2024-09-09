package finalkeyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tcs.neu.service.ClassInsidePackage;
//import packageName.className

public class FinalClass {

	 public static void main(String[] args) {
		 
		 ClassInsidePackage object = new ClassInsidePackage();
//		 object.x = 20;
		 
//		 	List<Integer> list = new ArrayList<>();
//		 	list.add(1);
//		 	list.add(2);
		 	
	        ImmutableClass obj = new ImmutableClass(10, Arrays.asList(1,2));
	        System.out.println("Value: " + obj.getValue());
	        
	        
	        List<Integer> list2 = obj.getListInts();
	        System.out.println("List Ints 2 "+ list2.toString());
	        list2.add(3);
	        
	        System.out.println("Intermediate list2 "+ list2.toString());
	        
	        List<Integer> list3 = obj.getListInts();
	        System.out.println("List Ints 3 "+ list3.toString());
	        
	    }
}


final class ImmutableClass {
    private final int value;
    private final List<Integer> listInts;//original refer
//    private final Person person;

    public ImmutableClass(int value, List<Integer> listInts) {
        this.value = value;
        this.listInts = listInts;
    }

    public int getValue() {
        return value;
    }
    
    public List<Integer> getListInts() {
    	List<Integer> duplicateRef = new ArrayList<>();
    	duplicateRef.addAll(listInts);
    	
        return duplicateRef;
    }
    
//    public void setValue(int value) {
//        this.value = value;
//    }
}

// This will cause a compile-time error
// class ExtendedClass extends ImmutableClass {
// }

/**
 * Summary
 * 1. `final` keyword used with class. then the class, we cannot inherit.
 * 
 * 2. Immutable class: once the values inside class is declared, we cannot change it.
 *
 * 3. Creating an Immutable Class:
 * 	3.1. All fields inside a class is private final. `private` it should be visible inside class only.
 * 			by using final keyword. once the value is set. we cannot change it.
 *  3.2 class itself should be final. no other class can extend it.
 *  3.3 not setter methods are allowed. we can set value only through constructor.
 * 
 * 
 * 
 * */

/**
 * Immutable class having mutable fields:
 * Any object inside a class are mutable fields.
 * this is breaking of contract of Immutability. if we have mutable fields in Immutable class;
 * 
 * inside a getter method of that field. return a duplicate reference.
 * */

/**
 * Interview question
 * 1. How to create Immutable class?
 * 2. Why String class is Immutable?
 * 		String constant pool
 * 		90% of the fields are String only
 * */



