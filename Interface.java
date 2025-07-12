interface Test{
    public abstract void meth1();
    public abstract void meth2();
}
interface Test1 extends Test{
    public abstract void meth3();
}
class Test2 implements Test1{
    public void meth1(){
        System.out.println("method 1");
    }
    public void meth2(){
        System.out.println("method 2"); 
    }
    public void meth3(){
        System.out.println("method 3");
    }
}

public class Interface{
    public static void main(String[] args){
        Test2 t=new Test2();
        t.meth2();
    }
}
