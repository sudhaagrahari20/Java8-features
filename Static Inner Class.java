public class Outer {
    static int a = 20;  
    static int data = 100;
    int b = 90; // non static variables -> not allowed
    
    public static void display(){
        System.out.println(a);
    }
    
    //static inner class
    //access outer: static variables : access
    //static class can not access : non static variables and methods of outer class..
    static class Inner{
        Inner(){
            System.out.println("This is Static Nested class..!");
            System.out.println("value of a: "+a);
        }
        void display(){
            System.out.println("Data: "+data);
        }
    
    }
}
public class Main{
    public static void main(String[] args){
        System.out.println(Outer.a);
        Outer.display();
        
        
        //static inner class object ->syntax     
        //OuterClass.InnerClass variable = new OuterClass.InnerClass();
        Outer.Inner obj = new Outer.Inner();
        obj.display();        
        
    }
}
