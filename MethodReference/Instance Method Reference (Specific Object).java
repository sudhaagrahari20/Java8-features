//Example-1
class Printer{
    void printMessage(){
        System.out.println("Printing...");
    }
}
public class Main{
    public static void main(String[] args){
        Printer p = new Printer();
        Runnable ref = p::printMessage;
        ref.run();
    }
}

//Example-2
import java.util.function.Consumer;
class Printer {
    void print(String message) {
        System.out.println("Printing: " + message);
    }
}
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(); // Creating an object of Printer

        // Using method reference to refer to an instance method of a specific object
        Consumer<String> consumer = printer::print;

        // Calling accept() method of Consumer
        consumer.accept("Hello, Method Reference!");
    }
}
