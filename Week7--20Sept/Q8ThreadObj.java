import java.util.Scanner;

class UserThreadPriority extends Thread {
    // Class variables for string and character input
    public static String k;
    public static char c;

    public UserThreadPriority(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        // Display thread name and process string and character
        System.out.println(this.getName() + " is running.");
        System.out.println(this.getName() + " received string: " + k + " and character: " + c);
    }
}

public class Q8ThreadObj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a string and a character from the user
        System.out.print("Enter a string: ");
        UserThreadPriority.k = scanner.nextLine(); // Assign to the class variable `k`

        System.out.print("Enter a character: ");
        UserThreadPriority.c = scanner.next().charAt(0); // Assign to the class variable `c`

        // Create thread objects
        UserThreadPriority threadobj1 = new UserThreadPriority("ThreadA");
        UserThreadPriority threadobj2 = new UserThreadPriority("ThreadB");

        // Start both threads
        threadobj1.start();
        threadobj2.start();
    }
}
