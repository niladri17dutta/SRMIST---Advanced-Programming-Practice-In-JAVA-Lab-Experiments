class Printer {
    private int currentJobNumber = 1;

    // Synchronized method to ensure jobs are printed in order
    public synchronized void printJob(int jobNumber) {
        while (jobNumber != currentJobNumber) {
            try {
                wait(); // Wait until it's this job's turn
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Printing the job
        System.out.println("Printing job number: " + jobNumber);
        
        // Move to the next job
        currentJobNumber++;
        notifyAll(); // Notify other waiting threads that the next job can proceed
    }
}

class PrintJob extends Thread {
    private final Printer printer;
    private final int jobNumber;

    public PrintJob(Printer printer, int jobNumber) {
        this.printer = printer;
        this.jobNumber = jobNumber;
    }

    @Override
    public void run() {
        printer.printJob(jobNumber); // Each job waits for its turn to print
    }
}

public class Q6PrinterSynchronization {
    public static void main(String[] args) {
        Printer printer = new Printer(); // Shared printer resource

        // Creating and starting print jobs
        Thread job1 = new PrintJob(printer, 1);
        Thread job2 = new PrintJob(printer, 2);
        Thread job3 = new PrintJob(printer, 3);
        Thread job4 = new PrintJob(printer, 4);
        Thread job5 = new PrintJob(printer, 5);

        // Start all jobs
        job5.start();
        job3.start();
        job2.start();
        job1.start();
        job4.start();
    }
}
