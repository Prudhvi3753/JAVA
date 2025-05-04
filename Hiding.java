class Rectangle{
    private int length;
    private int breadth;
    public double getlength(){
        return length;
    }
    public void setlength(int l){
        length=l;
    }
    public double getbreadth(){
        return breadth;
    }
    public void setbreadth(int b){
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
}
public class Hiding {
    public static void main(String[] args){
        Rectangle r=new Rectangle();
        r.setlength(4);
        r.setbreadth(5);
        System.out.println("Area:"+r.area());
    }
}
