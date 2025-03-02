//Syntax-> ClassName::staticMethod
//Example-1
public class Main{
    public static void sayHello(){
        System.out.println("Hello Sudha..!");
    }
    public static void main(String[] args){
        Runnable ref = Main::sayHello;
        ref.run();
    }
}

//Example-2
class Student{
    static void studentName(){
        System.out.println("My name is: Ram..!");
    }
}
public class Main{
    public static void main(String[] args){
        Runnable ref = Student::studentName;
        ref.run();
    }
}
