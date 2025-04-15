import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        while(a!=0){
            int b=a%10;
            sum+=b*b*b;
            a/=10;
        }
        if(sum==n){
        System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }

    
}
