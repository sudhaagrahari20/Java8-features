//Outer class
class OuterClass{
    private String message = "Hello from OuterClass!";
    static int num = 10;
    
    //Inner class
    class InnerClass{
        void display(){
            System.out.println(message);
            System.out.println("Number: "+num);
        }
    }
}
class Main {
    public static void main(String[] args) {
        //Outer class object
        OuterClass outer = new OuterClass();
        
        //Creating an object of InnerClass using OuterClass
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        inner.display();
    }
}
