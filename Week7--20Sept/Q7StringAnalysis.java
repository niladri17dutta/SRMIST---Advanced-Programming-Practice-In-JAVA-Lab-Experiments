class ThreadA extends Thread {
    private String k;
    private int dc = 0; // Variable to store the digit count

    public ThreadA(String k) {
        this.k = k;
    }

    @Override
    public void run() {
        // Find the number of digits in the string
        for (int i = 0; i < k.length(); i++) {
            if (Character.isDigit(k.charAt(i))) {
                dc++;
            }
        }
        System.out.println("ThreadA:digitscount=" + dc); // Print the digit count
    }
}

class ThreadB extends Thread {
    private String k;
    private int cc = 0; // Variable to store the alphabetic character count

    public ThreadB(String k) {
        this.k = k;
    }

    @Override
    public void run() {
        // Find the number of alphabetic characters in the string
        for (int i = 0; i < k.length(); i++) {
            if (Character.isAlphabetic(k.charAt(i))) {
                cc++;
            }
        }
        System.out.println("ThreadB:alphabetcount=" + cc); // Print the alphabetic count
    }
}

public class Q7StringAnalysis {
    public static void main(String[] args) {
        String k = "Hello123World456"; // Example string to analyze

        // Create and start ThreadA for digit counting
        ThreadA threadA = new ThreadA(k);
        threadA.start();

        // Create and start ThreadB for alphabetic character counting
        ThreadB threadB = new ThreadB(k);
        threadB.start();
    }
}
