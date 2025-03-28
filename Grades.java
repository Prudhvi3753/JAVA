import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        System.out.println("Enter your marks:");
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<5;i++){
            total+=arr[i];
        }
        int average=total/arr.length;
        if(average>=90){
            System.out.println("S grade");
        }else if(average>=80&&average<90){
            System.out.println("A grade");
        }
        else if(average>=70&&average<80){
            System.out.println("B grade");
        }else{
            System.out.println("fail");
        }
    }
}
