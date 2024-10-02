import java.util.List;

public class Q3aPureFunctionExample {

    // Pure function to find the maximum value in a list of numbers
    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 2, 8, 1, 9, 3);
        int maxValue = findMax(numbers);
        System.out.println("The maximum value is: " + maxValue);
    }
}
