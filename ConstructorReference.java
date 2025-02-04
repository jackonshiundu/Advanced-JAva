import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Student class with a constructor that takes a name as a parameter
class Student {
    String name;
    int age;

    // Constructor that initializes the 'name' field
    public Student(String name) {
        this.name = name;
    }

    // Overriding toString() to print the Student object in a readable format
    @Override
    public String toString() {
        return "Student{name='" + name + "'}";
    }
}

public class ConstructorReference {

    public static void main(String[] args) {
        // List of names
        List<String> names = Arrays.asList("John", "Jane", "June");

        // List to hold Student objects
        List<Student> students = new ArrayList<>();

        // Method 1: Using a for-loop to create Student objects
        for (String name : names) {
            students.add(new Student(name)); // Creating a new Student object for each name
        }

        // Method 2: Using Stream API with lambda expression
        students = names.stream()
                        .map(name -> new Student(name)) // Lambda expression to create Student objects
                        .toList(); // Collecting the results into a list

        // Method 3: Using Constructor Reference
        students = names.stream()
                        .map(Student::new) // Constructor reference to create Student objects
                        .toList(); // Collecting the results into a list

        // Printing the list of students
        System.out.println(students);
    }
}
