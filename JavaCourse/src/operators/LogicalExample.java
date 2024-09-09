package operators;

public class LogicalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x= 10;
		int y=5;
		
		//relation
		boolean a = x > y;//true
        boolean b = false;//false
        
        //&&: both conditions must be true
        //||: one of the condition must bt true
        

        System.out.println("a && b: " + (a && b));//true && false // Logical AND: false
        
        
        System.out.println("a || b: " + (a || b)); // Logical OR: true
        System.out.println("!a: " + !a);            // Logical NOT: false
	}

}
