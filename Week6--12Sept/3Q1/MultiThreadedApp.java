import java.util.Random;

class NumberGenerator extends Thread {
    private int number;
    private boolean even;
    private final Object lock;

    public NumberGenerator(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (lock) {
                number = random.nextInt(100);  // Generate random number between 0 and 99
                even = (number % 2 == 0);
                System.out.println("Generated number: " + number);
                lock.notifyAll();  // Notify other threads
            }
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public boolean isEven() {
        return even;
    }
}

class SquareThread extends Thread {
    private final NumberGenerator generator;
    private final Object lock;

    public SquareThread(NumberGenerator generator, Object lock) {
        this.generator = generator;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();  // Wait for notification from the generator
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (generator.isEven()) {
                    int num = generator.getNumber();
                    System.out.println("Square of " + num + ": " + (num * num));
                }
            }
        }
    }
}

class CubeThread extends Thread {
    private final NumberGenerator generator;
    private final Object lock;

    public CubeThread(NumberGenerator generator, Object lock) {
        this.generator = generator;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();  // Wait for notification from the generator
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!generator.isEven()) {
                    int num = generator.getNumber();
                    System.out.println("Cube of " + num + ": " + (num * num * num));
                }
            }
        }
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        Object lock = new Object();  // Shared lock for thread coordination
        NumberGenerator generator = new NumberGenerator(lock);
        SquareThread squareThread = new SquareThread(generator, lock);
        CubeThread cubeThread = new CubeThread(generator, lock);

        // Start all threads
        generator.start();
        squareThread.start();
        cubeThread.start();
    }
}
