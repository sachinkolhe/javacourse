package threadsproducerconsumer;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5); // Buffer capacity of 10
        //Shared resource has ArrayList

        Producer producer = new Producer(buffer);//task to produce
        Consumer consumer = new Consumer(buffer);//task to consume

        Thread producerThread = new Thread(producer);//thread worker: majoor
        Thread consumerThread = new Thread(consumer);//thread

        producerThread.start();
        consumerThread.start();

    }
}
