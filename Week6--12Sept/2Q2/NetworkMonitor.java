public class NetworkMonitor implements Runnable {
    private final String serviceName;
    private final long checkDuration;

    public NetworkMonitor(String serviceName, long checkDuration) {
        this.serviceName = serviceName;
        this.checkDuration = checkDuration;
    }

    @Override
    public void run() {
        try {
            // Simulate network check by putting the thread to sleep
            System.out.println(Thread.currentThread().getName() + ": Checking network status of " + serviceName);
            Thread.sleep(checkDuration);  // Simulates the time taken for network check
            
            // Update thread name after the check
            String updatedThreadName = "NetworkMonitor-" + serviceName + "-Checked";
            Thread.currentThread().setName(updatedThreadName);
            System.out.println("Thread name updated to: " + updatedThreadName);

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted while checking network: " + serviceName);
        }
    }

    public static void main(String[] args) {
        // Create threads for network checks
        Thread networkThread1 = new Thread(new NetworkMonitor("Service1", 3000), "NetworkMonitor-Service1");
        Thread networkThread2 = new Thread(new NetworkMonitor("Service2", 5000), "NetworkMonitor-Service2");

        // Start the threads
        networkThread1.start();
        networkThread2.start();

        try {
            // Wait for both threads to complete
            networkThread1.join();
            networkThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Network monitoring completed.");
    }
}
