import java.util.*;
public class Area {
    public static void main(String[] args){
        System.out.println("Enter the height of triangle:");
        Scanner sc=new Scanner(System.in);
        float h,b;
        h=sc.nextFloat();
        System.out.println("Enter the base of triangle:");
        b=sc.nextFloat();
        Float area=(b*h)/2;
        System.out.println("Area of Triangle with height "+h+" and base "+b+" is "+area );
    }
}
