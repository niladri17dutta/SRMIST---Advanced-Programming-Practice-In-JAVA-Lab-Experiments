package division;

public class Division {
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;  // Return 'Not a Number' to indicate an error
        }
    }
}
