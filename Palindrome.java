import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        while(a!=0){
            int b=a%10;
            sum=(sum*10)+b;
            a/=10;
        }
        if(sum==n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
