class Person {
    // Attributes
    private final String name;
    private final int age;
    private final String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not available";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class PersonInfo {
    public static void main(String[] args) {
        // Create a Person object using the default constructor
        Person person1 = new Person();

        // Create a Person object using the parameterized constructor
        Person person2 = new Person("Alice Smith", 30, "123 Maple Street");

        // Display information for both objects
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}
