package threads;

public class SynchronizationExample {

    public static void main(String[] args) {
     
        Counter counter = new Counter();//Shared Resource: Box

        // Create two threads that will increment the counter
        //CountRunnable is a task. Kaam
        //Thread t1 and t2 : worker threads : majoor
        Thread t1 =  new Thread(new CountRunnable(counter));
        Thread t2 = new Thread(new CountRunnable(counter));

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count value
        System.out.println("Final count: " + counter.getCount()); // Expected: 2000
    }
}

//Task
class CountRunnable implements Runnable {
	
	Counter counter;
	
	public CountRunnable(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		 for (int i = 0; i < 1000; i++) {
             counter.increment();
         }
	}
}
//Shared Resource: Box : before counting starts we should lock the object.
class Counter {
	private int count = 0;

	// Synchronized method to ensure thread-safe increment
	public void increment() {//1. thread t1 will come. counter object will be locked.
		synchronized(this) {
			count++;// increament the counter	
		}
		
		//100 statements
		//10 statements requires synch
		
	}// counter object will be unlocked.

	// Synchronized method to safely get the count
	public int getCount() {
		synchronized(this) {
			return count;
		}
	}
}


/**
 * Two Threads : Worker : Majoor
 * Runnable : Work : Kaam :- implements Runnable and override run method
 * Shared Resource : Box : Peti :- counting 
 * Locking mechanism on Shared Resources. Lock will always be on the Shared Resource. Box.
 * How do we lock? by using `synchronized` keyword
 * 
 * T1 ->  lock -> (Box(Shared Resource)) count -> unlock
 * T2 ->  wait here until the box is unlocked . lock -> (Box(Shared Resource)) count -> unlock
 * 
 * 
 * 
 * 
 * */


