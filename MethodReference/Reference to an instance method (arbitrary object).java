//Syntax-> ClassName::methodName (e.g., String::toUpperCase)

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "C++");
        
        // Using method reference (arbitrary object of a class)
        //names.forEach(String::toUpperCase); // This does not print anything, just returns values

        // Correct way: Using method reference to print values
        //names.forEach(System.out::println);
        
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
