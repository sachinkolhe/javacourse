package exception.handling;

public class Case4 {

		public static void main (String[] args) 
		{
			
			// array of size 4.
			int[] arr = new int[4];
			try
			{
				int i = arr[4];
				//Exception Object created by java/jvm. it will pass that object to jvm default exception handler
					
				// this statement will never execute
				// as exception is raised by above statement
				System.out.println("Inside try block");
			}
			
			finally
			{
				System.out.println("finally block executed");
			}
			
			// rest program will not execute
			System.out.println("Outside try-finally clause");
		}
	}

// in above code there is no catch block, any exception occurred will not be able to handle. 
// it will disrupt the normal execution flow. 
// but before disrupting/interrupting the program it will execute the finally block
