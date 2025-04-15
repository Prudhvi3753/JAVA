import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        int n=sc.nextInt();
        System.out.print(a+""+b);
        while(n!=2){
            int c=a+b;
            System.out.print(c);
            n--;
            a=b;
            b=c;
        }   
    }
    
}
