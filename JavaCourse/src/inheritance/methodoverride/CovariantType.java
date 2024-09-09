package inheritance.methodoverride;

public class CovariantType {

	    public static void main(String[] args) {
	        Parent p = new Child();
	        System.out.println(p.getNumber()); // Calls Child's getNumber method
	    }
	}

class Parent {
    public Number getNumber() {
        return 44;
    }
}

class Child extends Parent {
    @Override
    public Integer getNumber() {
        return 1; // Return type Integer is a subtype of Number
    }
}
/***
 * Covarient return type and Exception Handling in Method Overriding
 * 
 * 1. return type in super class either it should be SAME or it should be subclass of superClass return type
 * 2. exception throws in super class either it should be SAME or it should be subclass of superClass Exception
 * */
