package collectionsframework;
import java.util.*;

public class ComparableComparatorExample {
	 public static void main(String[] args) {
	        // Create a TreeSet of Person objects
//		 withSet();
		 withList();       
	    }
	 
	 private static void withList() {
		 List<Person> people = new ArrayList<>();
	        people.add(new Person("Alice", 30));
	        people.add(new Person("Bob", 25));
	        people.add(new Person("Charlie", 35));

	        // Sort by age (using Comparable)
	        Collections.sort(people);
	        System.out.println("Sorted by age: " + people);

	        // Sort by name (using Comparator)
	        people.sort(new PersonNameComparator());
	       
	        System.out.println("Sorted by name: " + people);
	 }

	private static void withSet() {
	
		TreeSet<Person> people = new TreeSet<>();
	        
	        // Add Person objects to the TreeSet
	        people.add(new Person("Alice", 31));//Alice
	        people.add(new Person("Bob", 25));//Bob
	        people.add(new Person("Charlie", 29));
	        people.add(new Person("David", 26));
	        
	        // Print the TreeSet
	        System.out.println("TreeSet of Person objects:");
	        for (Person person : people) {
	            System.out.println(person);
	        }
	}
}

/**
 * Alice, 30
 * Bob, 25
 * Charlie, 30
 * David 25
 * 
 * 
 * TreeSet
 * 1>>
 * Alice, 30 other
 * Bob, 25 	current
 * 
 * Bob, 25
 * Alice, 30
 * 
 * 2>>
 * Bob, 25
 * Alice, 30 > other
 * 
 * Charlie, 30 > current
 * 
 * 
 * */


class Person implements Comparable<Person> { //COmparable
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Implementing compareTo method for natural ordering
    @Override
    public int compareTo(Person other) {
        // First compare by age
//        if (this.age != other.age) {
//            return Integer.compare(this.age, other.age);
        
        	System.out.println("Current Object : "+ this.age + " - "+this.name );//Bob
        	System.out.println("Other Object : "+ other.age + " - "+other.name );//Alice
            return (this.age < other.age) ? -1 : ((this.age == other.age) ? 0 : 1);        
            
//        }
        
//    	System.out.println("Current Object Name : "+ this.age + " - "+this.name );//Bob
//    	System.out.println("Other Object Name : "+ other.age + " - "+other.name );
//        // If ages are equal, compare by name
//        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName()); // Sorting by name
    }
}
/**
 * Comparable : comparTo method Natural sorting
 * We can have single Comparable
 * Comparator: compare method 
 * Multiple Comparator for one collection we can have.
 * 
 * 
 * */



