import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for addition or 2 for subtraction:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } else if (choice == 2) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        } else {
            System.out.println("Invalid choice. Please enter 1 for addition or 2 for subtraction.");
        }
    }
}
