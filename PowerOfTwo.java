import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String []args){
    System.out.println("Enter a number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int i=1;
    int j=1;
    while(i<a){
        System.out.println(i);
        i=i*2;
    }
    do{
        System.out.println(j);
        j=j*2;
    }while(j<a);
    }

}
