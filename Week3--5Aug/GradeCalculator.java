class Student {
    // Attributes
    private final String name;
    private final int rollNumber;
    private final double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student details along with the grade
    public void displayStudentInfo() {
        char grade = calculateGrade();
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 101, 85.5);

        // Display student information and grade
        student.displayStudentInfo();
    }
}
