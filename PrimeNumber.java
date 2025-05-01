import java.util.Scanner;
public class PrimeNumber {
    static boolean isPrime(int a){
        for(int i=2;i<a/2;i++){
            if(a%i==0)
                return false;
        }
                return true;
    }
    public static void main(String[] args) {
        System.out.println("ENter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isPrime(a));
    }
    
}
