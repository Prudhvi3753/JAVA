import java.util.Scanner;
public class NumberToWord {
    public static void main(String [] args){
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str="";
        while(a!=0){
            int b=a%10;
            str=str+b;
            a/=10;
        }
        char c;
        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch(c){
                case '0':
                System.out.println("Zero");
                break;
                case '1':
                System.out.println("one");
                break;
                case '2':
                System.out.println("two");
                break;
                case '3':
                System.out.println("three");
                break;
                case '4':
                System.out.println("four");
                break;
                case '5':
                System.out.println("five");
                break;
                case '6':
                System.out.println("six");
                break;
                case '7':
                System.out.println("seven");
                break;
                case '8':
                System.out.println("eight");
                break;
                case '9':
                System.out.println("nine");
                break;

            }

        }
    }
    
}
