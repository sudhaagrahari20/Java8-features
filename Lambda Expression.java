//Using Lambda Expression
interface MyInterface {
    void show();
}
public class Main {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Hello from Lambda Expression!");
        obj.show();
    }
}


//Lambda Expression with One Parameter
interface MyName{
    void greet(String name);
}
public class Main {
    public static void main(String[] args){
        MyName obj = (name) -> System.out.println("Hello " + name);
        obj.greet("Sudha Agrahai");
    }
}


//Lambda Expression with Multiple Parameters
interface Calculator {
    int add(int a, int b);
}
public class Main {
    public static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(10, 20));
    }
}


//Creating a Thread Using Lambda Expression
public class Main {
    public static void main(String[] args){
        Thread thread = new Thread(() -> System.out.println("Thread is running.."));
        thread.start();
    }
}
