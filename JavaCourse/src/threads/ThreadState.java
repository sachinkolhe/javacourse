package threads;

public class ThreadState {

	public static void main(String[] args) {
		WorkerThread thread = new WorkerThread(); // New state
        // NEW
		System.out.println("Thread state: " + thread.getState()); // Output: NEW
        
		// NEW and Runnable
        System.out.println("Thread state before start: " + thread.getState()); // Output: NEW
        thread.start(); // Moves to RUNNABLE state
        System.out.println("Thread state after start: " + thread.getState()); // Output: RUNNABLE
    }
}

class WorkerThread extends Thread {//extending a thread class
	//all the properties of thread class will be inherited.
    public void run() {
        System.out.println("Thread is running");
    }
}

