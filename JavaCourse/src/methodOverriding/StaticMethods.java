package methodOverriding;

public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without creatting an object of a class we can access a static methods.
		int sum = MathUtil.add(5, 3);
        int difference = MathUtil.subtract(5, 3);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        
//        MathUtil2 mt = new MathUtil2();
//        mt.add(10, 20);

	}

}

class MathUtil2 {
	public int add(int a, int b) {
		return a+b;
	}
}
//two rules for static methods
//static methods can not access instance variable
//instance methods can access static variables + instance variables

class MathUtil {
	int x;//instance varibale
	static int y;//static variable
	
    public static int add(int a, int b) {
    
    	//cannot make static reference to non static field
    	System.out.println("value of x is "+ y);
    	return a + b;
    }
    
    public int add() {
    	System.out.println("value of x is "+ y);
    	return 0;
	}

    public static int subtract(int a, int b) {
        return a - b;
    }
}