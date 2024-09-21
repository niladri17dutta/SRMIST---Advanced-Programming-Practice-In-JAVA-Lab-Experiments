class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + this.getName() + " is going to sleep for 5 seconds.");
            Thread.sleep(5000); // Sleep for 5 seconds
            System.out.println("Thread " + this.getName() + " woke up.");
            
            // Change the name of the thread
            this.setName("ChangedThreadName");
            System.out.println("Thread name is changed to: " + this.getName());
            
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.getName() + " was interrupted.");
        }
    }
}

public class Q3ThreadNameChange {
    public static void main(String[] args) {
        MyThread thread = new MyThread("OriginalThreadName");
        thread.start();
    }
}
