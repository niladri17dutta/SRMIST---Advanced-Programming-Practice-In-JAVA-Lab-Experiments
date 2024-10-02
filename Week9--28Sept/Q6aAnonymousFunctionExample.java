public class Q6aAnonymousFunctionExample {

    public static void main(String[] args) {
        // Anonymous function to add two numbers
        int sum = ((java.util.function.BiFunction<Integer, Integer, Integer>) (a, b) -> a + b).apply(5, 3);
        System.out.println("Sum of 5 and 3 is: " + sum);
    }
}
