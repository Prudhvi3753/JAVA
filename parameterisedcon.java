class parent{
    public parent(){
        System.out.println("parent class");
    }
    public parent(int x){
        System.out.println("parameterised");
    }
}
class child extends parent{
    public child(){
        System.out.println("Child class");
    }
    public child(int y){
        System.out.println("parameterised");
    }
    public child(int x,int y){
        super(x);
    }
    public double area(int x,int y){
        return x*y;
    }
}
public class parameterisedcon {
    public static void main(String[] args){
        child c=new child();
        parent c1=new parent(2);
        System.out.println(c.area(6,2));
    }
}
