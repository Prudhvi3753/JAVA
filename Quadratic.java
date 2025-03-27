import java.util.Scanner;
public class Quadratic {
    public static void main(String []args){
        System.out.println("enter the Quotients:");
        Scanner s=new Scanner (System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        double r1,r2,d;
        d=Math.sqrt((b*b)-(4*a*c));
        r1=(-b+(d))/(2*a);
        r2=(-b-(d))/(2*a);
        System.out.println("Roots of the given equation are:"+r1+" and "+r2);

    }
}
