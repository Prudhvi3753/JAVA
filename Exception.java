import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        //try_catch 

        /*try{
            int c=x/y;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Division by zero not possible"+e);
        }*/

        //Nested Try Catch 
        //if one of the exception arrised then it directly go to catch bolck without checking the other exceptions

        int a[]={10,20,30,2,3};
        try{
            int r=a[0]/a[3];
            System.out.println(r);
            System.out.println(a[10]);
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not possible"+e);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter valid index value"+e);
        }
        System.out.println("Bye");
    }
}
