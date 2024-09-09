package exception.handling;

public class Case1 {

	public static void main(String[] args) {
		 // array of size 4.
        int[] arr = new int[4];// 0 1 2 3
        try
        {
            int i = arr[4];//it will give me an exception, ArrayIndexOutOfBoundsException
                 
            System.out.println("value at index 3 is "+ i);
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in Catch block of ArrayIndexOutOfBoundsException");
        }
        catch(NullPointerException ex)
        {
            System.out.println("Exception caught in Catch block NullPointerException");
        }
        finally
        {
            System.out.println("finally block executed");
        }
        
         
        // rest program will be executed
        System.out.println("Outside try-catch clause");
	}

}
/**
 * Summary:
 * Case 1: if we handle exception program will not crash, it will execute next step.
 * Case 2: if we dont handle exception program will crash, it will NOT execute next step.
 * Case 3: `finally`, in case of finally block, whether there is exception or no exception in the code, 
 * 			finally block always executes
 * 
 * */
