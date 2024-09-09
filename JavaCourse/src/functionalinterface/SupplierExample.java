package functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
			ex1();

			ex2();
	}
	
	 public static void ex1() {
	        Supplier<Double> randomSupplier = () -> new Random().nextDouble();

	        System.out.println(randomSupplier.get()); // Output: A random double value between 0.0 and 1.0
	        System.out.println(randomSupplier.get()); // Output: Another random double value
	    }

	    public static void ex2() {
	        Supplier<Emp> personSupplier = () -> new Emp("John Doe");

	        Emp person = personSupplier.get();
	        System.out.println(person); // Output: Person{name='John Doe'}
	    }
}


 class Emp {
    private String name;

    public Emp(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }


}
 /**
  * Predicate -> it accepts one argument and return Boolean: test
  * Function -> it accepts one argument and gives result.: apply
  * Supplier -> it does not accept any argument but only gives result. : get
  * Consumer -> it only accepts argument but do not gives result. : accept
  * 
  * */

