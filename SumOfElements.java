import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        System.out.println("Enter the no of elements in array:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int [] arr=new int[s]; 
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }  
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        } 
        int sum=0;
        for(int i=0;i<s;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}
