class ProcessThread extends Thread {
    private final int processId;

    public ProcessThread(int id) {
        this.processId = id;
    }

    @Override
    public void run() {
        // Simulate some work by sleeping
        try {
            System.out.println("Process " + processId + " with priority " + this.getPriority() + " is running.");
            Thread.sleep(100); // Sleep for 100 milliseconds
        } catch (InterruptedException e) {
            System.out.println("Process " + processId + " was interrupted.");
        }
        System.out.println("Process " + processId + " has finished execution.");
    }
}

public class Q10ThreadPriorityExample {
    public static void main(String[] args) {
        // Create thread objects with different priorities
        ProcessThread p1 = new ProcessThread(1);
        ProcessThread p2 = new ProcessThread(2);
        ProcessThread p3 = new ProcessThread(3);
        ProcessThread p4 = new ProcessThread(4);
        ProcessThread p5 = new ProcessThread(5);

        // Set priorities (1 is lowest, 10 is highest)
        p1.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        p2.setPriority(Thread.NORM_PRIORITY);  // Priority 5
        p3.setPriority(Thread.NORM_PRIORITY);  // Priority 5
        p4.setPriority(Thread.MAX_PRIORITY);    // Priority 10
        p5.setPriority(Thread.NORM_PRIORITY);   // Priority 5

        // Start all threads
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
