class PreviousThread extends Thread {
    @Override
    public void run() {
        System.out.println("PreviousThread is running.");
    }
}

// New class that extends from PreviousThread
class CustomThread extends PreviousThread {
    @Override
    public void run() {
        // Call the parent class run method
        super.start();

        // Array of sleep durations in nanoseconds
        long[] sleepTimes = {10, 20, 50, 70, 100};

        try {
            for (long sleepTime : sleepTimes) {
                // Sleep for the specified nanoseconds
                System.out.println("CustomThread sleeping for " + sleepTime + " nanoseconds.");
                Thread.sleep(0, (int) sleepTime); // Sleep for nanoseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("CustomThread has finished execution.");
    }
}

public class Q9SleepExample {
    public static void main(String[] args) {
        // Create an instance of CustomThread
        CustomThread customThread = new CustomThread();

        // Start the thread
        customThread.start();
    }
}
