package exception.handling;


/**
 * if class InvalidAgeException extends Exception then it becomes Checked/Compile Time Exception
 * if class InvalidAgeException extends RuntimeException then it becomes Unchecked/Runtime Exception
 * 
 * Checked Exception. Java Checks at the time of compilation.
 * Unchecked Exception. Java checks at the time of execution.
 * */


//Custom checked exception
public class InvalidAgeException extends Exception {
	
 // Default constructor
 public InvalidAgeException() {
     super();//super constructor Exception class constructor
 }

 // Constructor that accepts a message
 public InvalidAgeException(String message) {
     super(message);//super parameterized constructor of Exception class
 }

 // Constructor that accepts a message and cause
 public InvalidAgeException(String message, Throwable cause) {
     super(message, cause);
 }

 // Constructor that accepts a cause
 public InvalidAgeException(Throwable cause) {
     super(cause);
 }
}
