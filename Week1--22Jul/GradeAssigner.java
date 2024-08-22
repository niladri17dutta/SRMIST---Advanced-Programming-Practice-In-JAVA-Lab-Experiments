import java.util.Scanner;

public class GradeAssigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();
        char grade;
        String description;
        switch (score / 10) {
            case 10: // For scores from 100
            case 9:
                grade = 'A';
                description = "Excellent";
                break;
            case 8:
                grade = 'B';
                description = "Very Good";
                break;
            case 7:
                grade = 'C';
                description = "Good";
                break;
            case 6:
                grade = 'D';
                description = "Satisfactory";
                break;
            default:
                grade = 'F';
                description = "Fail";
                break;
        }
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            System.out.println("Your grade is: " + grade + " (" + description + ")");
        }
    }
}
