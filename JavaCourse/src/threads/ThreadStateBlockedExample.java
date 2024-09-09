package threads;

public class ThreadStateBlockedExample {
	
	public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        
        
        Thread t1 = new Thread(() -> {
            try {
                resource.method1();
            } catch (InterruptedException e) {
                
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                resource.method2(); // This will be blocked until t1 releases the lock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        
        //0: RUNNABLE and BLOCKED
        //100 : TIMED_WAITING and BLOCKED
        //1000 : both TERMINATED
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        System.out.println("Thread state after start: " + t1.getState()); //method 1
        System.out.println("Thread state after start: " + t2.getState()); //method 2
        
        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class SharedResource {
    synchronized void method1() throws InterruptedException { // acquire a lock of shared resource object
        Thread.sleep(1000); // Simulate work // sleep for 1 min
    }//release a lock here
    
    synchronized void method2() throws InterruptedException {//wait here until lock released
        // Try to acquire the lock
    }
}



