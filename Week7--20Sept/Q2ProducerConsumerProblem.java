class SharedData {
    private int data;
    private boolean hasData = false;

    // Method for producer to produce data
    public synchronized void produce(int value) {
        // Wait if data is already produced but not yet consumed
        while (hasData) {
            try {
                wait(); // Wait for the consumer to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Produce new data
        data = value;
        System.out.println("Producer produced: " + data);
        hasData = true;
        notify(); // Notify the consumer that new data is available
    }

    // Method for consumer to consume data
    public synchronized void consume() {
        // Wait if no data has been produced
        while (!hasData) {
            try {
                wait(); // Wait for the producer to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Consume the data
        System.out.println("Consumer consumed: " + data);
        hasData = false;
        notify(); // Notify the producer that data has been consumed
    }
}

// Producer class
class Producer extends Thread {
    private final SharedData sharedData;

    Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            value++; // Increment value
            sharedData.produce(value); // Produce the value
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer class
class Consumer extends Thread {
    private final SharedData sharedData;

    Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        while (true) {
            sharedData.consume(); // Consume the value
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class Q2ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData(); // Shared object

        Producer producer = new Producer(sharedData); // Create producer
        Consumer consumer = new Consumer(sharedData); // Create consumer

        producer.start(); // Start producer thread
        consumer.start(); // Start consumer thread
    }
}
