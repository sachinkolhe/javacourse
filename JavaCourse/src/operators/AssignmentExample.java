package operators;

public class AssignmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
        int b = 5;

        a += b; // Equivalent to a = a + b
        System.out.println("a += b: " + a); // 15

        a -= b; // Equivalent to a = a - b
        System.out.println("a -= b: " + a); // 10

        a *= b; // Equivalent to a = a * b
        System.out.println("a *= b: " + a); // 50

        a /= b; // Equivalent to a = a / b
        System.out.println("a /= b: " + a); // 10

        a %= b; // Equivalent to a = a % b
        System.out.println("a %= b: " + a); // 0
	}

}
