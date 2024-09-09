package collectionsframework;
import java.util.*;


public class SetExample {
	/**
	 * hashFunction(String str)
	 * {
	 *			any logic
	 * 	return str.length();
	 * }
	 * 
	 * 
	 * 
	 * 
	 * */
	
	/**
	 * Hashing function:
	 * String> A1 hashFunction("A1") { return size;}
	 * 			A12
	 * 
	 * A1>hashFunction("A1") return size; 2
	 * 
	 * arr[2]// O(1) for searching
	 * 
	 * 0 1 	2 	3 	4 Array
	 *     	A1 A12
	 *     
	 * HashSet
	 * HashMap
	 * 
	 * */
	
	
    public static void main(String[] args) {
        // HashSet example
//        Set<String> hashSet = new HashSet<>();
//        hashSet.add("Apple");//true
//        hashSet.add("Banana");//true
//        hashSet.add("Cherry");//true
//        boolean addedOrNot = hashSet.add("Apple"); // Duplicate element, will be ignored
//        //for-loop adding value into hashset
//        
//        System.out.println("Apple Added " + addedOrNot);
//        
//        System.out.println("HashSet: " + hashSet); // Order is not guaranteed

        // LinkedHashSet example
//        Set<String> linkedHashSet = new LinkedHashSet<>();//generic //Parent p = new CHild();
//        linkedHashSet.add("Dog");
//        linkedHashSet.add("Cat");
//        linkedHashSet.add("Elephant");
//        linkedHashSet.add("Dog"); // Duplicate element, will be ignored
//        
//        System.out.println("LinkedHashSet: " + linkedHashSet); // Maintains insertion order
//
//        // TreeSet example
//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("Banana");
//        treeSet.add("Apple");
//        treeSet.add("Cherry");
//        
//        System.out.println("TreeSet: " + treeSet); // Elements are sorted, Natural Order
//        
    	//how to covert arraylist into set
    	// for=loop on arraylist
    	// add one by one into set
    	
    	//hashset(Collection)
//        // Performing set operations
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));
        
        //set1- set2 = A,B,C - B,C,D = A

        // Union
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
    }
}
/***
 * install gitbash
 * git commit git push
 * 
 * Set >> 
 * 
 * Duplicates are not allowed.
 * HashFunction is going to used internally.
 * HashSet >> Order is not guarranteed
 * LinkedHashSet >> Insertion Order
 * TreeSet >> Natural Order
 * 
 * */

