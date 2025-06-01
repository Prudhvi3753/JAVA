

/*abstract class Super{
    public Super(){
        System.out.println("Super class");
    }
    public void meth(){
        System.out.println("First method");
    }
    abstract public void met();
}
class Sub extends Super{
    @Override
    public void met(){
        System.out.println("updated method");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Sub su=new Sub();
        su.met();
    }
}
*/

/*abstract class Kfc{
    public Kfc(){
        System.out.println("This is Kfc");
    }
    abstract public void open();
    abstract public void billing();
    abstract public void offer();
    abstract public void service();
}
class MyKfc extends Kfc{
    @Override
    public void open(){
        System.out.println("shop is open");
    }
    @Override
    public void billing(){
        System.out.println("shop has billing");
    }
    @Override
    public void offer(){
        System.out.println("shop gives offer");
    }
    @Override
    public void service(){
        System.out.println("shop has services");
    }
}
 
public class Abstract{
    public static void main(String[] args) {
        MyKfc my=new MyKfc();
        my.open();
        my.offer();
        my.billing();
    }
}
    */

abstract class Shape{
    
    abstract public double area();
    abstract public double perimeter();
}
class Circle extends Shape{
    double radius;
    public Circle(double r){
        this.radius=r;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(double l,double b){
        this.length=l;
        this.breadth=b;
    }
    @Override
    public double area(){
        return length*breadth;
    }
    @Override
    public double perimeter(){
        return 2*(length+breadth);
    }
}
    public class Abs{
    public static void main(String[] args) {
        Circle c1=new Circle(5.0);
        Rectangle c2=new Rectangle(2.0,4.0);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c2.perimeter());
        System.out.println(c2.area());
    }
}