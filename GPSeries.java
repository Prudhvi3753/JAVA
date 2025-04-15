import java.util.Scanner;
public class GPSeries {
    public static void main(String[] args){
        System.out.println("Enter start,end,commonratio:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int r=sc.nextInt();
        for(int i=s;i<=e;i=i*r){
            System.out.println(i);
        }
    }
    
}
