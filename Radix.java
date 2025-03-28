import java.util.Scanner;
public class Radix {
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.matches("[01]+")){
            System.out.println("Radix is 2");
        }else if(str.matches("[0-7]+")){
            System.out.println("radix is 8");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("Radix is 10");
        }else if(str.matches("[0-9A-F]+")){
            System.out.println("radix is 16");
        }else{
            System.out.println("Invalid");
        }
    } 
}
