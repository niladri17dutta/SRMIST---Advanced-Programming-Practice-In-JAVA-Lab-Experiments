// Abstract class Shape
abstract class Shape {
    // Abstract method calculateArea
    abstract double calculateArea();
    
    // Abstract method calculatePerimeter
    abstract double calculatePerimeter();
}

// Subclass Circle that extends Shape
class Circle extends Shape {
    private final double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculatePerimeter for Circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Rectangle that extends Shape
class Rectangle extends Shape {
    private final double length;
    private final double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for Rectangle
    @Override
    double calculateArea() {
        return length * width;
    }

    // Implementation of calculatePerimeter for Rectangle
    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String getLength() {
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    public String getWidth() {
        throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
    }

    public void setLength(double d) {
        throw new UnsupportedOperationException("Unimplemented method 'setLength'");
    }

    public void setWidth(double d) {
        throw new UnsupportedOperationException("Unimplemented method 'setWidth'");
    }
}

// Subclass Triangle that extends Shape
class Triangle extends Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    // Constructor for Triangle
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implementation of calculateArea for Triangle (using Heron's formula)
    @Override
    double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Implementation of calculatePerimeter for Triangle
    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

// Main class to test the implementation CalculateAreaPerimeter
public class Q1BCalculateAreaPerimeter {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 7);
        Shape triangle = new Triangle(3, 4, 5);
        
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
