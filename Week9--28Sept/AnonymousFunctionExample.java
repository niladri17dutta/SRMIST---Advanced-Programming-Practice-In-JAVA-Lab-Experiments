public class AnonymousFunctionExample {

    public static void main(String[] args) {
        // Anonymous function to multiply two numbers
        java.util.function.BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Call the function with values 4 and 6
        int product = multiply.apply(4, 6);
        System.out.println("Product of 4 and 6 is: " + product);
    }
}
