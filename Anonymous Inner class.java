//Anonymous Inner class with an abstract class
abstract class Anonymous{
    abstract void show();
}
public class Main {
    public static void main(String[] args){
        Anonymous obj = new Anonymous(){
            public void show(){
                System.out.println("This is a Anonymous inner class..!");
            }
        };
        obj.show();
        
    }
}


//Anonymous Inner class with an Interface
interface Anonymous{
     void sayHello();
}

public class Main {
    public static void main(String[] args){
        Anonymous obj = new Anonymous(){
            public void sayHello(){
                System.out.println("This is a Anonymous inner class..!");
            }
        };
        obj.sayHello();       
    }
}
