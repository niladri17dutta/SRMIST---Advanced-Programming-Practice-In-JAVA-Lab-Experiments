// Base class Calculator
class Calculator {
    // Method to perform addition
    public double calculate(double a, double b) {
        return a + b;
    }
}

// Subclass SubtractionCalculator
class SubtractionCalculator extends Calculator {
    // Override method to perform subtraction
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

// Subclass MultiplicationCalculator
class MultiplicationCalculator extends Calculator {
    // Override method to perform multiplication
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

// Subclass DivisionCalculator
class DivisionCalculator extends Calculator {
    // Override method to perform division
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

// Main class to test the calculators
public class Q2COverrideCalculator {
    public static void main(String[] args) {
        // Create instances of each calculator
        Calculator addCalc = new Calculator();
        Calculator subCalc = new SubtractionCalculator();
        Calculator mulCalc = new MultiplicationCalculator();
        Calculator divCalc = new DivisionCalculator();

        // Perform operations
        double a = 10.0;
        double b = 5.0;

        System.out.println("Addition: " + addCalc.calculate(a, b));
        System.out.println("Subtraction: " + subCalc.calculate(a, b));
        System.out.println("Multiplication: " + mulCalc.calculate(a, b));
        System.out.println("Division: " + divCalc.calculate(a, b));
    }
}
