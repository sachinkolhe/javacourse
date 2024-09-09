package functionalinterface;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		ex5();
	}
	
	 public static void ex1() {
		 //Function accepts one argument and gives one result
	        Function<String, Integer> stringLength = s -> s.length();
	        
	        //Predicate:-> Function<String, Boolean> predica = s -> s.length() > 0;
	
	        System.out.println(stringLength.apply("Hello")); // Output: 5
	        System.out.println(stringLength.apply("Java")); // Output: 4
	    }
	 
	 public static void ex2() {
	        Function<Integer, Integer> square = num -> num * num;
	        System.out.println(square.apply(4)); // Output: 16
	        System.out.println(square.apply(7)); // Output: 49
	}
	 
	 public static void ex3() {
	        Function<Integer, Integer> addFive = num -> num + 5;
	        Function<Integer, Integer> multiplyByTwo = num -> num * 2;

	        Function<Integer, Integer> addFiveAndMultiply = addFive.andThen(multiplyByTwo);
	        System.out.println(addFiveAndMultiply.apply(3)); // Output: 16 ((3 + 5) * 2)
	      
	    }
	 public static void ex4() {
	        Function<String, String> toUpperCase = String::toUpperCase;//Method reference
	        
//	        Function<String, String> toUpperCase1 = str -> str.toUpperCase();
	        

	        System.out.println(toUpperCase.apply("hello")); // Output: HELLO
	        System.out.println(toUpperCase.apply("world")); // Output: WORLD
	    }

	    public static void ex5() {
	        Function<Person, String> getFirstName = Person::getCompleteName;

	        Person person = new Person("John", "Doe");
	        System.out.println(getFirstName.apply(person)); // Output: John
	    }
}


 class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getCompleteName() {
    	return this.firstName + " - "+this.lastName;
    }


}

