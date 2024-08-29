// Base class Vehicle
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected int num_wheels;

    // Constructor for Vehicle
    public Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }

    // Method to display vehicle details
    public void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Wheels: " + num_wheels);
    }
}

// Engine interface
interface Engine {
    String getType();
    int getHorsepower();
    String getFuelType();
}

// Derived class Car that extends Vehicle and implements Engine
class Car extends Vehicle implements Engine {
    private final String type;
    private final int horsepower;
    private final String fuel_type;

    // Constructor for Car
    public Car(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    // Implement Engine methods
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuel_type;
    }

    // Method to display Car details
    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
    }
}

// Derived class Truck that extends Vehicle and implements Engine
class Truck extends Vehicle implements Engine {
    private final String type;
    private final int horsepower;
    private final String fuel_type;

    // Constructor for Truck
    public Truck(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    // Implement Engine methods
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuel_type;
    }

    // Method to display Truck details
    public void displayTruckInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
    }
}

// Derived class Motorcycle that extends Vehicle and implements Engine
class Motorcycle extends Vehicle implements Engine {
    private final String type;
    private final int horsepower;
    private final String fuel_type;

    // Constructor for Motorcycle
    public Motorcycle(String make, String model, int year, int num_wheels, String type, int horsepower, String fuel_type) {
        super(make, model, year, num_wheels);
        this.type = type;
        this.horsepower = horsepower;
        this.fuel_type = fuel_type;
    }

    // Implement Engine methods
    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public String getFuelType() {
        return fuel_type;
    }

    // Method to display Motorcycle details
    public void displayMotorcycleInfo() {
        displayVehicleInfo();
        System.out.println("Engine Type: " + getType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
    }
}

// Main class to test the implementation
public class Q3BVehicleDetails {
    public static void main(String[] args) {
        // Create Car object
        Car car = new Car("Toyota", "Camry", 2020, 4, "V6", 301, "Petrol");
        System.out.println("--- Car Information ---");
        car.displayCarInfo();

        // Create Truck object
        Truck truck = new Truck("Ford", "F-150", 2021, 4, "V8", 450, "Diesel");
        System.out.println("\n--- Truck Information ---");
        truck.displayTruckInfo();

        // Create Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Iron 883", 2019, 2, "V-Twin", 49, "Petrol");
        System.out.println("\n--- Motorcycle Information ---");
        motorcycle.displayMotorcycleInfo();
    }
}
