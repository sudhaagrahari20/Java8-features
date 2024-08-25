interface A{
    static void sayHello(){
        System.out.println("Hello !");
    }
}
public class MyClass implements A {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        A.sayHello();
    }
}



package staticMethods;

public interface MyInterface {
    public static void main(String[] args) {
        System.out.println("Hello from Interface");
    }
}

