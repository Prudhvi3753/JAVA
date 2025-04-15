import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
     System.out.println("enter a number:");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     for(int i=1;i<=a;i++){
        for(int j=1;j<=a;j++){
            System.out.print("("+i+","+j+")");
        }
        System.out.println("");
     }   
    }
    
}
