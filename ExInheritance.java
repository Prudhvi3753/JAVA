class ExampleInheritance{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends ExampleInheritance{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class ExInheritance{
    public static void main(String[] args){
        
        Cylinder c2=new Cylinder();
        c2.height=10;
        c2.radius=7;
        System.out.println(c2.volume());
    }
}

