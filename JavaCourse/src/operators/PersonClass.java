package operators;

public class PersonClass {

	

	
	    public static void main(String[] args) {
	        Person person = new Person("Alice", 30);
	        System.out.println("Before: " + person.name); // Output: Before: Alice

	        // Passing the object reference to the method
	        changeName(person, "Bob");

	        System.out.println("After: " + person.name); // Output: After: Bob
	    }

	    public static void changeName(Person p, String newName) {
	        p.updateName(newName); // Modifies the original object
	    }
	

}

 class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void updateName(String newName) {
        this.name = newName;
    }
}
