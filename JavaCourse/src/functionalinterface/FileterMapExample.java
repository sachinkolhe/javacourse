package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FileterMapExample {

	//
	//Anonymouse Inner class extends the interface
	//We can not create an object of interface
	
	 	Function<String, String> functionMapToUppercase1 = new Function<String, String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		}; 
	
		 Function<String, String> functionMapToUppercase2 = word -> {
			 return word.toUpperCase();
		 };
	
		 Function<String, String> functionMapToUppercase3 = word -> word.toUpperCase();
		 
		 Function<String, String> functionMapToUppercase4 = String::toUpperCase;
	//
	
	
	
	public static void main(String[] args) {
		
		ex5();
	}
	/**
	 * streams
	 * filter: always used predicate: accepts one argument and gives rsult in Boolean
	 * map: always used function
	 * */
	
	public static void ex1() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry");
        Predicate<String> startsWithAPredicate = word -> word.startsWith("a");
       
       
		
		Function<String, String> functionMapToUppercase1 = word -> word.toUpperCase();
		
		
        
        List<String> filteredAndMapped = 
        		words.stream()
        				.filter(startsWithAPredicate)//predicate
        				.map(functionMapToUppercase1)//function
        				.collect(Collectors.toList());

        System.out.println(filteredAndMapped); // Output: [APPLE, AVOCADO]
    }

	 public static void ex2() {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

	        List<Integer> squaredEvens = 
	        		numbers.stream()
	        				.filter(num -> num % 2 == 0)//filtering out even numbers
	        				.map(num -> num * num)//map function .. squaring it
	        				.collect(Collectors.toList());

	        System.out.println(squaredEvens); // Output: [4, 16, 36]
	    }
	 
	 public static void ex3() {
	        List<Student> people = Arrays.asList(
	            new Student("Alice", 30),
	            new Student("Bob", 25),
	            new Student("Charlie", 35)
	        );
	        
	        Function<Student, String> mapStuentRetString = student -> student.getName();
	        
	        Function<Student, Student> mapStuentRetObject = student -> {
	        	student.setName("Hello "+student.getName());
	        	return student;
	        };
	        
	        Predicate<Student> predicateStudent = student -> student.getAge() >= 30;
	        Predicate<String> predicateStudentString = student -> student.length() > 0;

//	        List<String> namesOfOlderPeople = people.stream()
//	            .filter(person -> person.getAge() >= 30)//predicate filter out data whose age is greater than 30
//	            .map(mapStuent)//map to name
//	            .collect(Collectors.toList());
	        
	        //streaming a student object
	       List<String> list = people.stream()
	        		.filter(predicateStudent)
	        		.map(mapStuentRetString)
	        		.collect(Collectors.toList())
	        		;

	        System.out.println(list); // Output: [Alice, Charlie]
	    }
	 
	 public static void ex4() {
	        List<String> items = Arrays.asList("apple", "banana", "kiwi", "mango");

	        List<String> labeledItems = items.stream()
	            .filter(item -> item.length() > 4)//predicate
	            .map(item -> "Item: " + item)//function
	            .collect(Collectors.toList());

	        System.out.println(labeledItems); // Output: [Item: apple, Item: banana, Item: mango]
	    }
	 public static void ex5() {
	        double[] numbers = {-1.5, 2.3, -3.4, 4.5, 0.0};

	        
	        double doubledPositives = DoubleStream.of(numbers)
	            .filter(num -> num > 0)//predicate
	            .map(num -> num * 2)//function
	            .sum();

	        System.out.println(doubledPositives);
//	        System.out.println(Arrays.toString(doubledPositives)); // Output: [4.6, 9.0]
	    }
	 
}




     class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
             this.name = name;
        }
        
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        
        @Override
        public String toString() {
        	return this.name + " - "+this.age;
        }
    }

   


