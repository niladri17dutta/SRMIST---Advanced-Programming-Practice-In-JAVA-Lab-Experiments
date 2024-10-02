import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3bImpureFunctionExample {

    // Impure function that sorts a list of numbers in ascending order
    public static void sortList(List<Integer> numbers) {
        Collections.sort(numbers);  // Modifies the original list
        System.out.println("Sorted list: " + numbers);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1, 9, 3));
        sortList(numbers);  // The original list will be changed
    }
}
