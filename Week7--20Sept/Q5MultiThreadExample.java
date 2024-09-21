class UserThread extends Thread {
    public UserThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(this.getName() + " is running, count: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " was interrupted.");
        }
    }
}

public class Q5MultiThreadExample {
    public static void main(String[] args) {
        // Creating a user thread
        UserThread userThread = new UserThread("UserThread");
        
        // Starting both the user thread and main thread
        userThread.start();
        
        // Main thread execution
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread is running, count: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Joining user thread to wait until it completes
        try {
            userThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for user thread.");
        }

        System.out.println("Both threads have finished execution.");
    }
}
