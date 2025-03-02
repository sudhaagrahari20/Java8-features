package defaultMethods;

interface Parent {
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child implements Parent{
    @Override
    public void sayHello() {
        System.out.println("Chlid says hello");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Parent c = new Child();
        c.sayHello();
    }
}
