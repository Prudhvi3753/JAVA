class Shape{
    int length;
    int breadth;
    
    public void display(){
        System.out.println(length*breadth);
    }
}
class rectangle extends Shape{
    public rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
}
public class Example{
    public static void main(String[] args) {
        rectangle r=new rectangle(2,3);
        r.display();
    }
}