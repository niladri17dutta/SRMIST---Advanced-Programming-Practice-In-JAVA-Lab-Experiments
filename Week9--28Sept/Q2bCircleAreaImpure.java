import java.util.Scanner;

public class Q2bCircleAreaImpure {

    // Impure function that prompts the user for the radius and prints the area
    public static void getRadiusAndPrintArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculating the area
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    public static void main(String[] args) {
        getRadiusAndPrintArea();
    }
}
