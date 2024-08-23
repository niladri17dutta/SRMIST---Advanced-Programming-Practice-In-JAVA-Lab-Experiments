public class Car {
    // Attributes of the Car class
    String model;
    int year;
    String color;

    // Constructor to initialize Car objects
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println(); // Blank line for better readability
    }

    // Main method
    public static void main(String[] args) {
        // Create two Car objects
        Car car1 = new Car("Toyota Camry", 2020, "Red");
        Car car2 = new Car("Honda Accord", 2019, "Blue");

        // Display their information
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
