import java.util.List;
import java.util.stream.Collectors;

public class Q8bAnonymousFunctionExample {

    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        
        // Anonymous function to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)  // Lambda expression to filter even numbers
                .collect(Collectors.toList());
        
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
