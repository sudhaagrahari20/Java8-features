import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        
        Optional<String> optional = Optional.of("Hello, Java!");
        System.out.println(optional.isPresent());
        System.out.println("Optional Value: " + optional.get());
        System.out.println(optional.orElse(""));
        
        // String name = null;
        // Optional<String> optionalName = Optional.ofNullable(name);
        // System.out.print(optionalName.isPresent());
        
        Optional<String> optional1 = Optional.of("John");
        //Convert to uppercase if isPresent
        Optional<String> uppercase = optional1.map(String::toUpperCase);
        System.out.println(uppercase.get());
        
        
        // Optinal<String> optionalValue = Optional.empty();
        // String value = optionalValue.orElseThrow(() -> new RuntimeException("Value is missing!"));
        // System.out.println(value);

    
    }
}
