import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// This class demonstrates the use of the Optional class in Java, which is used to handle null values more gracefully.
public class OptionClass {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Jackon", "John", "Doe");

        // Use the Stream API to filter names that contain the letter "J" and find the first match
        // The result is wrapped in an Optional<String> to handle the possibility of no match being found
        Optional<String> name = names.stream().filter(str -> str.contains("J")).findFirst();

        // Print the first element of the list directly
        // Note: This line does not use the Optional class and will throw an IndexOutOfBoundsException if the list is empty
        System.out.println(names.get(0));

        // The above line will not throw a NullPointerException because the list is not empty,
        // but if the list were empty, it would throw an IndexOutOfBoundsException.

        // To handle the case where no match is found, we use the Optional class's orElse method
        // This line filters names that contain the letter "X" and finds the first match
        // If no match is found, it returns "Not Found" instead of throwing an exception
        String name1 = names.stream().filter(str -> str.contains("X")).findFirst().orElse("Not Found");

        // Print the result of the above operation
        // Since no name contains "X", it will print "Not Found"
        System.out.println(name1);
    }
}