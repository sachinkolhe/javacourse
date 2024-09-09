package exception.handling;

public class Throw {

	public static void main(String[] args) {

		AgeValidator validator = new AgeValidator();
        try {
            validator.validateAge(17); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
	}

}
 class AgeValidator {

    public void validateAge(int age) {
        if (age < 0) {
        	IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Age cannot be negative");
            
//        	MeraException exception = new MeraException();
//        	throw exception;
            //throw create an object of Exception
        } else if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("Age is valid: " + age);
    }

}
 
 //creating an custom exception
 class MeraException  {
	 
 }

