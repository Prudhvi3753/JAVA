import java.util.Scanner;
public class MethodOverloadingArea {
    static double Rectangle(double l,double b){
        return l*b;
    }
    static double Circle(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args){
        System.out.println("enter length,breath,radius:");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        float r=sc.nextFloat();
        System.out.println(Rectangle(l,b));
        System.out.println(Circle(r));
    }
}
