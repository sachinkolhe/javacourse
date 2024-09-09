package exception.handling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1.");
		int num1 = scanner.nextInt();
	
		System.out.println("Enter number 2.");
		int num2 = scanner.nextInt();
		
		int dividend = 0;
		try {
		 dividend = num1 / num2;//business logic
		}catch(Exception ex){
//			ex.printStackTrace();
			System.out.println("Exception " + ex.getLocalizedMessage());
			System.out.println("Number 2 cannot be zero.");
			
		}
		System.out.println("Dividend is "+ dividend);
		
		
	}

}
/**
 * if you feel writing a business logic of any problem, that there might be some exception occurr 
 * then you have to handle it.
 * 
 * how to handle? by using try catch block.
 * 
 * */
