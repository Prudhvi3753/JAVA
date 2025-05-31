class calc{
    public int a,b;
    public void sum(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a-b);
    }
   
}
class Scintific extends calc{
    public void mul(int a,int b){
        System.out.println(a*b);
    }
}
public class Calculator {
    public static void main(String []args){
        Scintific sc=new Scintific();
        sc.a=1;
        sc.b=2;
        sc.sum();
        sc.sub();
        sc.mul(2,3);


        
        
    }
}
