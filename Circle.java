

class Circle1{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
public class Circle {
    public static void main(String [] args){
        Circle1 c1=new Circle1();
        Circle1 c2=new Circle1();
        c1.radius=4;
        c2.radius=7.23;
        System.out.println("Area:"+c1.area());
        System.out.println("perimeter:"+c1.perimeter());
        System.out.println("Area:"+c2.area());
        System.out.println("perimeter:"+c2.perimeter());


    }
}
