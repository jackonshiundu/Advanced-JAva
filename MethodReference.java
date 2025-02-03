import java.util.Arrays;
import java.util.List;

public class MethodReference {

    /*
     * Method Reference in Java:
     * Method reference is a shorthand notation for a lambda expression to call a method.
     * It is used to make the code more readable and concise.
     * There are four types of method references:
     * 1. Reference to a static method: ClassName::staticMethodName
     * 2. Reference to an instance method of a particular object: object::instanceMethodName
     * 3. Reference to an instance method of an arbitrary object of a particular type: ClassName::instanceMethodName
     * 4. Reference to a constructor: ClassName::new
     *
     * In this example, we are using the third type:
     * Reference to an instance method of an arbitrary object of a particular type (String::toUpperCase).
     * Here, `String::toUpperCase` is a method reference that refers to the `toUpperCase` method
     * of the `String` class. It is equivalent to the lambda expression: `s -> s.toUpperCase()`.
     */

    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("John", "Jane", "June", "Mark");

        // Use method reference to convert each name to uppercase
        List<String> uNames = names.stream()
                                   .map(String::toUpperCase) // Method reference to String::toUpperCase
                                   .toList(); // Collect the results into a new list

        // Print the list of uppercase names
        System.out.println(uNames);
    }
}