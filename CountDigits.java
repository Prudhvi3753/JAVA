import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter anumber:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        while(a!=0){
            int b=a%10;
            c++;
            a/=10;
        }   
        System.out.println("No of Digits are:"+c);
    }
    
}
