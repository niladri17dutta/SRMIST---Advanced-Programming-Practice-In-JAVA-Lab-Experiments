import java.util.Arrays;
import java.util.Random;

public class StudentGrades {

    public static void main(String[] args) {
        // 1. Create an integer array to store the grades of 30 students
        int[] grades = new int[30];
        
        // 2. Populate the array with random grades between 0 and 100
        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(101); // Generates a random number between 0 and 100
        }
        
        // 3. Calculate and print the average grade of the class
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("Average Grade: " + average);
        
        // 4. Find and print the highest and lowest grades
        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        
        // 5. Sort the grades in descending order and print the top 5 scores
        Arrays.sort(grades);
        System.out.println("Top 5 Scores:");
        for (int i = grades.length - 1; i >= grades.length - 5; i--) {
            System.out.println(grades[i]);
        }
    }
}