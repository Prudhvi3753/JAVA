import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        System .out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<a;i++){
            System.out.println(i);
        }
        for(int i=a;i>0;i--){
            System.out.println(i);
        }
    }
    
}
