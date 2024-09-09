package inheritance.constructor.chaining;

public class ConstChainSameClass {

	public static void main(String[] args) {
		 	Person p1 = new Person(); // Calls default constructor
//	        Person p2 = new Person("Alice", 30); // Calls parameterized constructor

	        p1.display();
//	        p2.display();
	}

}

class Person {
	//fields
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this("Unknown", 0); // Calls the parameterized constructor
        Person p3 = new Person("P3",1); //going into infinte loop
        this.name = "P3";
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
    	//can we call a constructor from a method? 
    	//constructor is getting called when object is getting created
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
