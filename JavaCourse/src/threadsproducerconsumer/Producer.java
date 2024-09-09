package threadsproducerconsumer;

public class Producer implements Runnable {
    private final SharedBuffer buffer;
    private int itemId = 0;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.produce(itemId++);
                Thread.sleep(1000); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

