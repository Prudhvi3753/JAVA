class Cylin{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double SurfaceArea(){
        return 2*lidArea()+Circumference()*height;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
    public double Volume(){
        return lidArea()*height;
    }
}
public class Cylinder {
    public static void main(String[] args){
        Cylin c=new Cylin();
        c.radius=7;
        c.height=4;
        System.out.println("LidArea:"+c.lidArea());
        System.out.println("Surface Area:"+c.SurfaceArea());
        System.out.println("Conference:"+c.Circumference());
        System.out.println("Volume:"+c.Volume());
    } 
}
