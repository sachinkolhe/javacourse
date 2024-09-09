package threads;

public class ThreadExample {

	public static void main(String[] args) {
        MyThread t1 = new MyThread();//creating an object of thread class
        t1.run(); //starting a thread. start() method is inside a THread. it will call run method which we override
        
        
        System.out.println("Main Method Ends.");
    }

}
//extending a thread
//one of the way to create a thread

class MyThread extends Thread {
    public void run() {
    	//Task here
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread ID : "+Thread.currentThread().getId() + " Value: " + i);
        }
    }
}


/***
 * Main Thread will call main() method
 * 
 * public static void main() {
 * 
 * 		print line
 * 		thread.start();//spawning or creating a another thread. int i to 5 printing
 * 		print
 * 		operation
 * 		print
 * 
 * }
 * 
 * 
 * 
 * */


