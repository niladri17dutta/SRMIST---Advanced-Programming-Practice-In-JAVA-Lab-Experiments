class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getters and Setters for width and height (optional)
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Calculate and print the area
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Calculate and print the perimeter
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
