interface Test1{
    void meth1();
    void meth2();
}
class Test2 implements Test1{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2");
    }
    
}
public class Interface {
    public static void main(String[] args) {
        Test1 t=new Test2();
        t.meth1();
        t.meth2();
        
    }
}
