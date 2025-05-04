class rect{
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        rect r1=new rect();
        rect r2=new rect(); 
        r1.length=4;
        r2.length=6;
        r1.breadth=8;
        r2.breadth=9;
        System.out.println("Area:"+r1.area());
        System.out.println("Perimeter:"+r1.perimeter());
        System.out.println("Area:"+r2.area());
        System.out.println("Perimeter:"+r2.perimeter());
    }
}
