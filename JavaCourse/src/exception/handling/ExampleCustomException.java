package exception.handling;

public class ExampleCustomException {

    public static void main(String[] args)  {
//        try {
//            Person person = new Person(-1); // This will throw InvalidAgeException
//        } catch (InvalidAgeException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//            
//        }

//        try {
//            Person person = new Person(25);
//            person.setAge(-5); // This will also throw InvalidAgeException
//        } catch (InvalidAgeException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
    	
    	
    	
			try {
				Person person = new Person(-1);
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
    }

}


