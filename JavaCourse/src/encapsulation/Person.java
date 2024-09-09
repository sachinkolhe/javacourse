package encapsulation;

/***
 * Encapsulation contract
 * all varialbles/fields inside a class should have private access modifier
 * all methods should be public and getter and setters for each variable
 * 
 * ***/
public class Person {
	
	//singleton object: private constructor
	
    // Private fields// accessible only from this class
    private String name;
    public int age;

    //Constructor with no param
    public Person() {
    	
    }
    // Constructor with param
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
        	throw new RuntimeException("Age must be greater than 0");
        }
    }
}
