package functionalinterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	/**
	 * basic built in functional interfaces:
	  * Predicate -> it accepts one argument and return Boolean: test
	  * Function -> it accepts one argument and gives result.: apply
	  * Supplier -> it does not accept any argument but only gives result. : get
	  * Consumer -> it only accepts argument but do not gives result. : accept
	  * 
	  * */

	public static void main(String[] args) {

		ex3();
	}
	



	    public static void ex1() {
	        Consumer<String> printConsumer = s -> System.out.println(s);

	        printConsumer.accept("Hello, World!"); // Output: Hello, World!
	        printConsumer.accept("Java Consumer Example"); // Output: Java Consumer Example
	    }
	    
	    public static void ex2() {
	        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
	        Consumer<String> printLength = s -> System.out.println("Length: " + s.length());

	        Consumer<String> combinedConsumer = printUpperCase.andThen(printLength);

	        combinedConsumer.accept("hello");
	        // Output:
	        // HELLO
	        // Length: 5
	    }
	    
	    public static void ex3() {
	        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

	        Consumer<String> greetConsumer = name -> System.out.println("Hello, " + name + "!");

	        names.forEach(greetConsumer);//for each is one of the for loop which accepts the consumer
	        // Output:
	        // Hello, Alice!
	        // Hello, Bob!
	        // Hello, Charlie!
	    }


}
