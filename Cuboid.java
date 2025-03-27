import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        System .out.println("Enter the length,breadth and height: ");
        Scanner sc= new Scanner(System.in);
        int length,breath,height;
        length=sc.nextInt();
        breath=sc.nextInt();
        height=sc.nextInt();
        int area=2*(length*breath+length*height+breath*height);
        int volume=length*breath*height;
        System.out.println("Area of cuboid is:"+area);
        System.out.println("Volume of cuboid is:"+volume);
    }
    
}
