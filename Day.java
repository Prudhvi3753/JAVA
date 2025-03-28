/*import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        if(d==1){
            System.out.println("Monday");
        }else if(d==2){
            System.out.println("tuesday");
        }else if(d==3){
        System.out.println("wednesday");
    }else if(d==4){
    System.out.println("thursday");
}else if(d==5){
    System.out.println("friday");
}else if(d==6){
    System.out.println("saturday");
}else if(d==7){
    System.out.println("sunday");
}
    }
}*/

import java.util.Scanner;
public class Day{
    public static void main(String[] args) {
      System.out.println("enter a number:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch (n) {
          case 1:
          System.out.println("Monday");
              
              break;
                  case 2:
          System.out.println("tuesday");
              
              break;
              case 3:
          System.out.println("wednesday");
              
              break;
              case 4:
          System.out.println("thursday");
              
              break;
              case 5:
          System.out.println("friday");
              
              break;
              case 6:
          System.out.println("Saturday");
              
              break;
              case 7:
              System.out.println("sunday");
                  
                  break;
      }  
    }
}
