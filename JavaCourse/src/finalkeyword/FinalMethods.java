package finalkeyword;

public class FinalMethods {

	 public static void main(String[] args) {
//	        BaseClass obj = new SubClass();
//	        obj.display(); // Calls BaseClass's display method
	        
	        
		 	SubClass sub = new SubClass();
		 	sub.display2();
	    }

}

class BaseClass {
    public final void display() {
        System.out.println("BaseClass display");
    }
    
}

class SubClass extends BaseClass {
    // This will cause a compile-time error
//     @Override
//     public void display() {
//         System.out.println("SubClass display");
//     }

     public void display2() {
         super.display();// display method is final but public access modifer
     }
}

// Summary of final methods
// private we can not override because the method it self is not visible
// final we can not override. because of final keyword but we can call this method by using super keyword



