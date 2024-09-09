package operators;

public class RelationalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
        int b = 5;

        //Whenever you perform any relational operation between variables, it will always return a boolean true/false
        
        System.out.println("a == b: " + (a == b)); // Equal to: false
        System.out.println("a != b: " + (a != b)); // Not equal to: true
        System.out.println("a > b: " + (a > b));   // Greater than: true
        System.out.println("a < b: " + (a < b));   // Less than: false
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to: true
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to: false
	}

}
