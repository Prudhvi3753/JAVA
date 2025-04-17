import java.util.Scanner;
public class Rotation {
    public static void main(String [] args){
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int []arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[s-1];
        for(int i=s-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
