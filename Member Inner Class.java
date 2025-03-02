class Outer {
    private int a = 20;
    static int b = 100;
    int c = 90; 
    
    //MemberInnner class
    class MemberInner{
        public void doSum(){
            System.out.println("Sum is: "+(a+b+c));
        }
    
    }
}
public class Main{
    public static void main(String[] args){
        //Outer object ->first
        Outer outer = new Outer();
        //Member class object 
        Outer.MemberInner obj = outer.new MemberInner();
        obj.doSum();
          
    }
}
