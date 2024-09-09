package methodOverriding;

public class OverloadingVarargsExample {
    // Method with one int parameter
//    public void display(int a) {
//        System.out.println("Single int: " + a);
//    }

    // Method with varargs
    public void display(int x, int... numbers) { //<dataType>... <variableName>
        System.out.print("int Varargs: ");
        System.out.println("the value of x is " + x);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    
    
    public void display(float... fs) {
    	 System.out.print("float Varargs: ");
         //enhanced for loop
    	 for (float number : fs) {
             System.out.print(number + " ");
         }
//         fs.length;
         //traditional for loop
         for(int i =0 ;i<fs.length;i++) {
        	 System.out.print(fs[i] + " ");
         }
         System.out.println();
    }
    
//    public void display(int... numbers, float... fs) {
//    	
//    }
    
    //example 1
//    public void display(int x, int[] numbers) {
//    	
//    }
    
    //example 2
//    public void display(int[] numbers) {
//    	
//    }
    
    //example 3
//    public void display(int x, int y) {
//    	
//    }

    public static void main(String[] args) {
        OverloadingVarargsExample example = new OverloadingVarargsExample();
        
        example.display(5);             // Calls method with single int
//        example.display(1, 2, 3, 4);    // Calls method with varargs
//        example.display(1.2f, 3.4f);
        
        //ambiguity
//        example.display();              // Calls method with varargs (no arguments)
    }
}

