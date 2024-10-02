import java.util.List;

public class Q4bImmutableFunctionExample {

    // Immutable function to calculate the average age of all students in the list
    public static double calculateAverageAge(List<Student> students) {
        int totalAge = 0;
        for (Student student : students) {
            totalAge += student.age;
        }
        return students.size() > 0 ? (double) totalAge / students.size() : 0.0;
    }

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Alice", 20, 85.5),
                new Student("Bob", 22, 78.0)
        );

        double averageAge = calculateAverageAge(studentList);
        System.out.println("Average Age: " + averageAge);
    }
}
