//Default Constructor
public class Test{
    int number;
    String name;
    
    public static void main(String[] args){
        Test obj = new Test();
        
        System.out.println(obj.number);
        System.out.println(obj.name);
        
    }
}


//No- Argument Constructor
public class Test2{
    public Test2(){
        System.out.println("Test2 constructor invoked...");
        
    }
    public static void main(String[] args){
        // Test2 obj = new Test2();
        new Test2();
    }
}


//Parameterized Constructor
public class Test3{
    public Test3(int no, String name){
        System.out.println("Test3 Constructor called");
    }
    public static void main(String[] args){
        Test3 obj = new Test3(100, "Ridhika");
    }
}


//Example
public class Student{
    int rollno;
    String name;
    
    Student(int rn, String n){
        rollno = rn;
        name = n;
    }
    public static void main(String[] args){
        Student obj = new Student(101, "Amit");
        System.out.println(obj.name+" : "+obj.rollno);
    }
}
