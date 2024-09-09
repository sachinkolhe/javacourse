package methodOverriding;

public class StaticBlocks {

	 public static int value;

    static {
        // Static block for initialization
        value = 10;
        System.out.println("Static block executed.");
    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Value: " + value);
	}
	
	//Interview question
	//can we run above code without main method?
	//yes. we can run this in java 7 and below version
	//no. in java 8 we will get exception. Main method not found

}
/**
 * class is getting loaded into JVM
 * then it runs static blocks
 * then it calls main method
 * 	1. public access modifier : it is visible throught the application
 *  2. static method : dont have to create an object
 * 
 * */
