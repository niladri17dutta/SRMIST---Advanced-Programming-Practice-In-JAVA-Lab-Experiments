import java.util.Scanner;

public class WhileeStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt(); // Read the number of lines from the user

        int i = 1; // Initialize the outer loop counter
        while (i <= n) {
            int j = 1; // Initialize the inner loop counter
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line
            i++;
        }
    }
}
