class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread " + this.getName() + " counting: " + i);
                Thread.sleep(6000); // Sleep for 6 seconds
            }
            
            // Change the name of the thread after the loop
            this.setName("ChangedThreadName");
            System.out.println("Thread name changed to: " + this.getName());

        } catch (InterruptedException e) {
            System.out.println("Thread " + this.getName() + " was interrupted.");
        }
    }
}

public class Q4ThreadNameChangeInLoop {
    public static void main(String[] args) {
        MyThread thread = new MyThread("OriginalThreadName");
        thread.start();
    }
}
