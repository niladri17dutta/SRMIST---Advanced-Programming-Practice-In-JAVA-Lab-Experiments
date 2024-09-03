// Calculator class
class Calculator {

    // Method to add two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public double calculate(double a, double b) {
        return a + b;
    }

    // Method to perform arithmetic operations based on the operator
    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+' -> {
                return a + b;
            }
            case '-' -> {
                return a - b;
            }
            case '*' -> {
                return a * b;
            }
            case '/' -> {
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            }
            default -> {
                System.out.println("Error: Invalid operator");
                return 0;
            }
        }
    }
}

// Main class to test the Calculator
public class Q2BCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing the calculate method with two integers
        System.out.println("Sum of 5 and 10: " + calculator.calculate(5, 10));

        // Testing the calculate method with two double values
        System.out.println("Sum of 5.5 and 10.5: " + calculator.calculate(5.5, 10.5));

        // Testing the calculate method with two integers and an operator
        System.out.println("5 + 10: " + calculator.calculate(5, 10, '+'));
        System.out.println("10 - 5: " + calculator.calculate(10, 5, '-'));
        System.out.println("5 * 10: " + calculator.calculate(5, 10, '*'));
        System.out.println("10 / 5: " + calculator.calculate(10, 5, '/'));
        System.out.println("10 / 0: " + calculator.calculate(10, 0, '/'));  // Division by zero case
    }
}
