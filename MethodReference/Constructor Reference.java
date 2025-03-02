import java.util.function.Function;
class Person {
    String name;
    
    //Constuctor
    Person(String name){
        this.name = name;
        System.out.println(name);
    }
}
public class Main{
    public static void main(String[] args){
      // Using constructor reference with Function<T, R>
        Function<String, Person> p1 = Person::new;
      
       // Calling apply() method of Function to create an object
        Person p = p1.apply("John Doe");
    }
}
