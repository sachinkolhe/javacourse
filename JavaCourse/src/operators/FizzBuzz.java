package operators;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 15;
		
		if(x % 3 == 0 && x % 5 == 0) {
			System.out.println("Fizz Buzz");
		}
		else if(x % 3 == 0) {
			System.out.println("Fizz");
		  } 
		  
		else if(x % 5 == 0) {
			System.out.println("Buzz");
		  } 
		else {
			System.out.println("Not divisible by both 3 & 5");
		}
		
	}

}
