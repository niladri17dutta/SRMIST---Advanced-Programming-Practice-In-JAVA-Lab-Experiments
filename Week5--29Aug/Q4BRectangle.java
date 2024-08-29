public class Q4BRectangle {
    // Private instance variables
    private double length;
    private double width;

    // Constructor to initialize the rectangle
    public Q4BRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rect = new Rectangle(10.0, 5.0);

        // Accessing and modifying the length and width using getter and setter methods
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());

        rect.setLength(15.0);
        rect.setWidth(7.5);

        System.out.println("Updated Length: " + rect.getLength());
        System.out.println("Updated Width: " + rect.getWidth());

        // Calculating area and perimeter
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
