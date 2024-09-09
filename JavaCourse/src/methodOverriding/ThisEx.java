package methodOverriding;

public class ThisEx {

	public static void main(String[] args) {
		
		Person p = new Person("Sachin");
		System.out.println(p.toString());
		
		
	}

}
class Person {
    private String name;//Instance variable
    
    //constuctor
    //paremetrized constructor

    public Person(String name) {
        this.name = name; // 'this.name' refers to the instance variable, 'name' refers to the parameter
        this.getName();
    }
    
    public String getName(){
    	return this.name;
    }
    
    @Override
    public String toString() {
    	return this.name;
    }
}

//Instance variable hiding

