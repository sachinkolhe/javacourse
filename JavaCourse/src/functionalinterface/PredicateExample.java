package functionalinterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

	public static void main(String[] args) {

		ex4();

	}
	
	
	public static void ex1() {
	    Predicate<String> isEmpty = s -> s.isEmpty();
	    
//	    Predicate<String> newPredicate = new Predicate<String>() {
//	    	
//	    	public boolean test(String t) {
//	    		return t.isEmpty();
//	    	};
//		};
	
	    System.out.println(isEmpty.test("")); // Output: true
	    System.out.println(isEmpty.test("Hello")); // Output: false
	}
	
	 public static void ex2() {
	        Predicate<Integer> isPositive = num -> num > 0;

	        System.out.println(isPositive.test(5)); // Output: true
	        System.out.println(isPositive.test(-3)); // Output: false
	    }
	 
	 public static void ex3() {
		 	//basic predicate
	        Predicate<Integer> isEven = num -> num % 2 == 0;
	        Predicate<Integer> isPositive = num -> num > 0;

	        //chaining with other predicates
	        Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
	        Predicate<Integer> isEvenOrPositive = isEven.or(isPositive);
	        Predicate<Integer> isNotPositive = isPositive.negate();

	        System.out.println(isEvenAndPositive.test(4)); // Output: true
	        System.out.println(isEvenAndPositive.test(-4)); // Output: false
	        
	        System.out.println(isEvenOrPositive.test(-3)); // Output: false
	        
	        System.out.println(isNotPositive.test(5)); // Output: false
	        System.out.println(isNotPositive.test(-5)); // Output: true
	    }
	 
	 
	 public static void ex4() {
	        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry");

	        Predicate<String> startsWithA = fruits -> fruits.startsWith("a");

	        List<String> filteredWords = words.stream() //creating a stream
	                                          .filter(startsWithA) // filtering the list with predicate
	                                          .collect(Collectors.toList()); //collecting to list
	        
	        //filter method accepts only predicate

	        System.out.println(filteredWords); // Output: [apple, apricot]
	    }
	 /**
	  *  Filter out even numbers from list by using stream and predicate
	  *  List<Integer> words = Arrays.asList(12,34,56,45,66,7,9,0,11);
	  * 
	  * */
	 

	


}
