package methodOverriding;

public class StaticVariables {

	public static void main(String[] args) {

		Counter c1 = new Counter();
        Counter c2 = new Counter();
        
        // Access static variable using class name
        //best practices. how to access a static variable
        //<className>.<staticVariable> or 
        //<className>.<staticMethod> 
        System.out.println("How many objects of Counter class has been created. the Count: " + Counter.count);
        
        //Interview question will this work ?
        //we can access through instance of class i.e object.
        System.out.println("C1 Count: " + c1.count);
        
        // Access static method using class name
        Counter.displayCount();
        
      //Interview question will this work ? 
        c1.displayCount();
        
      
        
	}

}

class Counter {
    public static int count = 0; // Static variable

    //constructor
    public Counter() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count Method: " + count);
    }
}
