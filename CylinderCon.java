class Cylinder{
    private double radius;
    private double height;
    public Cylinder(double r,double h){
        radius=r;
        height=h;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return area()*height;
    }
    public double surfaceArea(){
        return 2*area()+circumference()*height;
    }
}
public class CylinderCon {
    public static void main(String []args){
        Cylinder c=new Cylinder(3.45,6);
        System.out.println("Area:"+c.area());
        System.out.println("perimeter:"+c.circumference());
        System.out.println("Volume:"+c.volume());
        System.out.println("Surface Area:"+c.surfaceArea());
    }
}
