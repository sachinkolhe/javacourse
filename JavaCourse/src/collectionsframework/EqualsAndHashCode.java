package collectionsframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class EqualsAndHashCode {

	public static void main(String[] args) {

//		Map<Employee, Employee> map = new HashMap<>();
//		
		Set<Employee> set = new HashSet<>();
		
		set.add(new Employee("A", 23));
		set.add(new Employee("B", 23));
		set.add(new Employee("A", 23));
		set.add(new Employee("C", 23));
		
		System.out.println(set);
		
	}

}

 class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //reference check if reference are same 
        
        if (o == null || getClass() != o.getClass()) return false;
        
        Employee person = (Employee) o; //converting object into Employee. type casting
        return this.age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
    	//this gives you a index to an array
    	//hasfunction
    	//it returns a hascode
    	//Objects.hash is java's built in function
        return Objects.hash(name, age);
    }
    
    @Override
    public String toString() {
    	return this.name + " - " + this.age;
    }
}

