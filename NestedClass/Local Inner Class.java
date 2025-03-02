class Outer {
    private int num = 10;
    void OuterMethod(){
        //Inner class
        class LocalInner{
            void show(){
                System.out.println("Number: "+num);
            }
        }
        
        //Local Inner class object
        LocalInner inner = new LocalInner();
        inner.show();
    }
}
public class Main{
    public static void main(String[] args){
        
        //Outer object
        Outer outer = new Outer();
        outer.OuterMethod();
    
    }
}
