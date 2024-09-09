package operators;

public class UnaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;

        System.out.println("+a: " + (+a)); // Unary plus: 10
        System.out.println("-a: " + (-a)); // Unary minus: -10
        
        System.out.println("a++: " + (a++)); // Post-increment: 10 (a becomes 11)
        
        System.out.println("the value of a present here "+ a);
        
        System.out.println("++a: " + (++a)); // Pre-increment: 12
        System.out.println("a--: " + (a--)); // Post-decrement: 12 (a becomes 11)
        System.out.println("--a: " + (--a)); // Pre-decrement: 10
        
        
        System.out.println("!true: " + !true); // Logical NOT: false
	}

}
