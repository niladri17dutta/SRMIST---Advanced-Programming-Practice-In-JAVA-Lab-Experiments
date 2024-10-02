import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}

public class Q4aMutableFunctionExample {

    // Mutable function to add a new student to the list
    public static void addStudent(List<Student> students, String name, int age, double grade) {
        students.add(new Student(name, age, grade));  // Modifies the original list
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        addStudent(studentList, "Alice", 20, 85.5);
        addStudent(studentList, "Bob", 22, 78.0);

        // Print updated list
        System.out.println("Student Records: " + studentList);
    }
}
