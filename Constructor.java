class cons{
    private double radius;
    public cons(){
        radius=1;
    }
    public cons(double r){
        radius=r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
public class Constructor {
    public static void main(String []args){
        cons c=new cons(); 
        cons c1=new cons(3.44);
        System.out.println("Area:"+c.area());
        System.out.println("Area:"+c1.area());
    }
}
