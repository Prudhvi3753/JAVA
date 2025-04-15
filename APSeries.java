import java.util.Scanner;
public class APSeries {
    public static void main(String[] args) {
     System.out.println("enter start ,end and difference of series:");
     Scanner sc= new Scanner(System.in);
     int s=sc.nextInt();
     int e=sc.nextInt();
     int d=sc.nextInt();
     for(int i=s;i<=e;i=i+d){
        System.out.println(i+" ");
     }   
    }
}
