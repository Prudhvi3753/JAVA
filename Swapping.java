import java.util.Scanner;
public class Swapping {
    public static void main(String[] args){
        System.out.println("Enter the two numbers:");
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping:"+"a="+a+" and b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swaping:a="+a+" and b="+b);
    }
}
