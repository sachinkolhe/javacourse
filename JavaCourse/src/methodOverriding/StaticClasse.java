package methodOverriding;

public class StaticClasse {

	private static String outerStaticField = "Outer static field";

	//inner static class
     public static class StaticNestedClass {
        void display() {
            // Access static member of the outer class
            System.out.println("Outer static field: " + outerStaticField);
        }
    }

    public static void main(String[] args) {
    
    	StaticNestedClass nested = new StaticNestedClass();
        nested.display();
    }

}
//Interview: can we create a object of a class outside of this class?
