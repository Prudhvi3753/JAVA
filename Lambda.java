
@FunctionalInterface
interface MYLambda{
    public void display();
}
public class Lambda{
    public static void main(String[] args){
        MYLambda my=()->{System.out.println("Hello world");};
        my.display();
    }
}
