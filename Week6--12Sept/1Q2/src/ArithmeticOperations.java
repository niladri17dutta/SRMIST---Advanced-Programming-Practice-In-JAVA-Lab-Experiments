import addition.Addition;
import division.Division;
import multiplication.Multiplication;
import subtraction.Subtraction;

public class ArithmeticOperations {
    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;

    public ArithmeticOperations() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
    }

    public double performAddition(double a, double b) {
        return addition.add(a, b);
    }

    public double performSubtraction(double a, double b) {
        return subtraction.subtract(a, b);
    }

    public double performMultiplication(double a, double b) {
        return multiplication.multiply(a, b);
    }

    public double performDivision(double a, double b) {
        return division.divide(a, b);
    }

    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();
        
        // Test the arithmetic operations
        double a = 12.5, b = 3.5;
        System.out.println("Addition: " + operations.performAddition(a, b));
        System.out.println("Subtraction: " + operations.performSubtraction(a, b));
        System.out.println("Multiplication: " + operations.performMultiplication(a, b));
        System.out.println("Division: " + operations.performDivision(a, b));
    }
}
