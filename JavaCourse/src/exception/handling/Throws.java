package exception.handling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

	public static void main(String[] args) {

		FileReaderExample example = new FileReaderExample();
        try {
            int result = example.readFile("nonexistentfile.txt"); // This will throw an IOException
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
	}

}

 class FileReaderExample {

    // Method that declares it can throw IOException
    public int readFile(String fileName) throws IOException  {//Checked Exception
        FileReader fileReader = null;
		try {
			fileReader = new FileReader(fileName);
		
			int data = fileReader.read();
	        
	        while (data != -1) {
	            System.out.print((char) data);
	            data = fileReader.read();
	        }
	        
	        return 1;
		} catch (FileNotFoundException e) {
			return 0;
		} catch (IOException e) {
			return 0;
		} finally {
			if(fileReader!= null){
				fileReader.close();
			 }
			return 2;
		}
        
    }

}
 //IOException is parent class of FIleNotFoundException
 
 //		Throwable
 //Error 		Exception
 //OOM			RuntimeException

