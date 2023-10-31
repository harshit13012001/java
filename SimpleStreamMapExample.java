import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamMapExample {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use Stream API to double each number using the map operation
        List<Integer> doubledNumbers = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toList());

        // Print the doubled numbers
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Doubled Numbers: " + doubledNumbers);
    }
}
