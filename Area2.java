import java.util.Scanner;
public class Area2 {
    public static void main(String[] args){
        System.out.println("Enter sides of the triangle:");
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,area;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        area=Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is:"+area);
    }
    
}
