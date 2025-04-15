import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0){
            int b=a%10;
            System.out.println(b);
            a/=10;
        }   
    }
    
}
