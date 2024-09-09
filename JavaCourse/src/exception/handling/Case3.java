package exception.handling;

public class Case3 {

	public static void main(String[] args) {

		
	try
	{
		
		String str = "123f";
			
		int num = Integer.parseInt(str);
			
		// this statement will execute
		// as no any exception is raised by above statement
		System.out.println("try block fully executed");
		
	}
	
	catch(NumberFormatException ex)
	{
			
		System.out.println("catch block executed...");
			
	}
	
	finally
	{
		System.out.println("finally block executed");
	}

	System.out.println("Outside try-catch-finally clause");
	}
}
