package stringhandling;

public class StringImmutable {

    public static void main(String[] args) {
        String original = "hello";
        String modified = original.concat(" world"); // Creates a new string

        System.out.println("Original: " + original); // Prints "hello"
        System.out.println("Modified: " + modified); // Prints "hello world"
    }
    /**
     * SCP:
     * "hello" <----------- original
     * "hello world" <--------- modified
     * 
     * `final` class
     * `private final` all the fields
     * `no setter methods` setting value through constructor only
     * 
     * 
     * */

}
/***
 *
 * The concat method does not modify the original string (original). 
 * Instead, it returns a new String object with the concatenated result.
 * The original string remains unchanged, demonstrating that strings are immutable.
 * 
 * ***/
/**
 * 
 * How Immutability is Achieved
Final Fields:
The String class uses final fields to store the character data, 
which means once the string is initialized, its data cannot be altered.

No Mutator Methods:
The String class does not provide any methods that alter the content of the string. 
Methods like concat(), toUpperCase(), and substring() return new String objects 
rather than modifying the existing one.
 * */
 