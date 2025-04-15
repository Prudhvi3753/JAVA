import java.util.Scanner;
public class SumOfnNumbers {
    public static void main(String[] args){
        System.out.println("Enter anumber:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a!=0){
            int b=a%10;
            sum+=b;
            a/=10;
        }
        System.out.println("Sum of numbers are:"+sum);
    }
    
}
