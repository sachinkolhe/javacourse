package exception.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {
		
		 try {
			FileReader fileReader = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			//any backup plan
			System.out.println("Handling checked exception");
		}
		 
		 String str = "";
		 
		 try {
		 for(int i = 0 ;i< 10;i++) {
			 char ch = str.charAt(i);
			 System.out.println(ch);
		 }
		 }catch(Exception ex){
			 System.out.println("exception is handled");
		 }
		 
	}

}
//Checked Exception compiler wants/force you to handle these exceptions
//Unchecked Exception these are runtime exception.
