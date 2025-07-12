class Outer{
    int x=10;
    void OuterDisplay(){
        inner i=new inner();
        i.InnerDisplay();
        System.out.println(x);
    }
    class inner{
        int y=20;
        void InnerDisplay(){
            System.out.println(x+y);
        }
    }
}
public class InnerClass {
    public static void main(String[] args){
        Outer o=new Outer();
        o.OuterDisplay();
    }
}
