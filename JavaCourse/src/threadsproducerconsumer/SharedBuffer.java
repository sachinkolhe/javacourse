package threadsproducerconsumer;

import java.util.ArrayList;
import java.util.List;

public class SharedBuffer {
    private final List<Integer> buffer = new ArrayList<>();
    private final int capacity; //5

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized  void produce(int item) throws InterruptedException {
    	//`synchronized` : acquire lock. sharedBuffer object will be locked
        while (buffer.size() == capacity) {
        	//t1 is waiting
            this.wait(); // Wait until there is space in the buffer. 
            //wait method on the sharedBuffer object.
            //release a lock
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify any waiting consumers that there is a new item
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); // Wait until there is an item to consume
        }
        int item = buffer.remove(0);
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify any waiting producers that there is space in the buffer
        return item;
    }
    
    
}

