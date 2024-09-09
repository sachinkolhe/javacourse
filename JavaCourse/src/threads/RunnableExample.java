package threads;

public class RunnableExample {

	public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());//passing a runnable instance to thread
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        
        
        System.out.println("Maint thread execution is here.");
        
//        try {
//        	//main thread will wait here to complete the execution of t1 and t2 threads
//			t1.join();
//			t2.join();
//        } catch (InterruptedException e) {
//			
//		}
        
        try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			
		}
       
        
        System.out.println("Main Method Ends.");
    }
}

//execution of Main method or main thread should wait to completed the execution of other threads

/**
 * run() method: Contains the code to be executed by the thread.
Thread constructor: Takes a Runnable object and executes its run() method when the thread is started.
 * 
 * */
//task or work for a thread
class MyRunnable implements Runnable {//task you need to do parallel
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            System.out.println("Thread ID: "+Thread.currentThread().getId() + " Value: " + i);
        }
        System.out.println("Thread run method completed");
    }
}
/**
 * Two ways to create a thread
 * by extending Thread Class
 * by implementing Runnable Interface
 * 
 * we should override a run method.
 * purpose of run method: task we need to give to thread we can write it here.
 * 
 * Create a object of Thread Class Only.
 * 
 * 
 * start(); method will start the execution of thread.
 * start method internally calls the run method
 * 
 * 
 * Order of execution of thread cannot be guaranteed.
 * 
 * */

/***
 * 
 * Join method stop the execution of current thread
 * current thread waits to complete the t1 thread. t1.join()
 * 
 * 
 * */

/***
 * 
 * deciding a groom
 * deciding a venue: venueThread
 * printing a card >>>>> 
 * 			> check the quality of paper
 * 			> check the design
 * 			> check the font
 * 			> venueThread.join();
 * 			> print a card
 * 
 * deciding a menu 
 * 
 * 
 * 
 * 
 * */
