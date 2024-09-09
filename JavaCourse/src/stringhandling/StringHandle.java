package stringhandling;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringHandle {

    public static void main(String[] args) {
        // 1. Creating Strings
        String s1 = "Hello, World!"; //String literal
        String s2 = new String("Hello, World!"); //creating an object
        
        System.out.println("string s1 is " + s1);
        System.out.println("string s2 is " + s2);
        //JVM
        //String Constant Pool: String literal
        //Java Heap Memory: creating an String Object
        

//        // 2. String Methods
//        System.out.println("How to check the length?");
//        System.out.println("s1 Length is : " + s1.length());
//
//        //if we are concatenating string with number then it always going to be a string
//        System.out.println("Concatenation: " + s1 + " How are you?");
//        
//        int a = 10;
//        String x = "20";
//        
//        System.out.println("The output of concatenation " + a+x);
////        System.out.println("");
//        //30
//        //1020
//        //2010
//        
//        //0 1 2 3 4 5 6 7 8 9 10 11 12
//        //H e l l o ,   W o r l   d !
//        System.out.println("Substring: " + s1.substring(3, 5) + s1.substring(8, 12));
//        //substring method is accepting two values. startCharIndex, endCharIndex
//        //include startIndex and exclude endIndex
//
//        
//        System.out.println("Character at index 1: " + s1.charAt(1));
//        
////        System.out.println("Start: Printing characters");
////        for(int i=0; i < s1.length() ; i++) {
////        	System.out.println(s1.charAt(i));
////        }
////        System.out.println("  End: Printing characters");
//        
//        System.out.println("Index of 'World': " + s1.indexOf("World"));
//        System.out.println("Index of 'Heo': " + s1.indexOf("Heo"));//-1 indicates its not present in the string
//        
//        System.out.println("Replace 'World' with 'Java': " + s1.replace("World", "Java"));
//        System.out.println("Uppercase: " + s1.toUpperCase());
//        System.out.println("Lowercase: " + s1.toLowerCase());
//        //uppercase and lowercase only applicable for alphabets
//        
//        
//        String str = "                            Hello,          World!                        ";
//        System.out.println("Before Trimmed: "+ str);
//        System.out.println("After Trimmed: " + str.trim());
//        //trim method trim the whitespace before first char and after end char
//        
//        
//        System.out.println("Split by '|': ");
//        String splitStr = "Stop|Here";
//        String[] splitArr = splitStr.split("\\|");//this is for special character \\
//        for(int i=0; i < splitArr.length; i++){
//        	System.out.println( i+"th value of splitStr is: "+ splitArr[i]);
//        }
//        
//        
//        String joinedString = String.join(",", "Hello", "World", "Java","Anything");
//        System.out.println("Joined String is: " + joinedString);
//        
//        System.out.println("Equals 'Hello, World!': " + s1.equals("Hello, World!"));
//        System.out.println("EqualsIgnoreCase 'hello, world!': " + s1.equalsIgnoreCase("hello, world!"));


        //        // 3. String Formatting
        String formatted = String.format("Hello, %s! You are %d years old.", "Alice", 30);
        System.out.println("Formatted String: " + formatted);
//
//        // 4. Mutable Strings: StringBuilder and StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.append('A');
        sb.append(Boolean.FALSE);
        sb.append(10);
        System.out.println("StringBuilder: " + sb.toString());
//
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf.toString());
        //difference between StringBuilder and StringBuffer is thread safety in String Buffer class
        
//
//        // 5. String Interning
        String s3 = s1.intern();
        System.out.println("string s3 is "+s3);
        boolean isEqual = (s2 == s3);//== operator is comparing reference
        boolean isEqual2 = (s2.equals(s3));//equals method is comparing the actual values
        System.out.println("output of isequal2 with equals: "+ isEqual2);
        System.out.println("String interning: " + isEqual);
//
//        // 6. Regular Expressions
        Pattern pattern = Pattern.compile("\\D+"); // Matches one or more digits
        Matcher matcher = pattern.matcher("There are 123 apples.");
        //regex101.com website

        System.out.print("Matches: ");
        while (matcher.find()) {
            System.out.println(matcher.group() + " "); // "123"
        }
        //string replace method
        //str.replace("")
    }
}

