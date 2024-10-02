import java.util.List;
import java.util.stream.Collectors;

public class Q7aAnonymousFunctionExample {

    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = List.of(1, 2, 3, 4);
        
        // Anonymous function to square each element in the list
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)  // Lambda expression to square each number
                .collect(Collectors.toList());
        
        System.out.println("Squared Numbers: " + squaredNumbers);
    }
}
