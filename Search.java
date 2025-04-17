import java.util.Scanner;
public class Search {
    public static void main(String[] args){
        System.out.println("Enter a number to search:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int []arr={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==s){
                System.out.println(i);
            }
        }
    }
    
}
