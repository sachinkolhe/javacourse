package finalkeyword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
	
	
	final Integer x;//final instance variable
	
	
	//init block
	{
//		this.x=0;
	}
	
	Constants() {
		this.x = 0;
	}
	
	Constants(int x) {
		this.x = x;
	}
	
	
    public static final int MAX_SIZE = 100; //final static Constant value: its accessible through all instances or class level

    public void display() {
        final int localValue = 10; // Local constant
        System.out.println("Local constant value: " + localValue);
//         localValue = 20; // Compile-time error: cannot assign a value to final variable localValue
    }
    
    public static void main(String[] args) {
        System.out.println("MAX_SIZE: " + Constants.MAX_SIZE);
//        Constants.MAX_SIZE = 20;
        
        
        //final Object
        final Constants const2 = new Constants();
//        const2.x=10;
//        const2.x=20;
        System.out.println("the value of constant x is "+const2.x);
        
        
        
//        const2 = new Constants();
        
    }
}

/***
 * Summary of `final` variable
 * 1. once we define a variable with `final` keyword we can not change its value. it become constants.
 * 
 * 2. once we define/create an object with `final` keyword we cannot reinitialized its reference. reference become constants.
 * 
 * 3. final instance variable, we can initialize through constructor as well. 
 * 
 * 4. can we init final variable through init block?
 * 
 * 
 * */


