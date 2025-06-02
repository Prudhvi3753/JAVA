import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Assessment1 {
    public static void main(String[] args){
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                factors.add(i);
            }
        }
       Collections.sort(factors,Collections.reverseOrder());
       if(factors.size()>=b){
        System.out.println(factors.get(b-1));
       }
        
    }
}
