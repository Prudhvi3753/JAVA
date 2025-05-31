class Test{
    public int max(int a,int b){
        return a>b?a:b;
    }
    public int max(int a,int b,int c){
        if(a>b && a>c) return a;
        else if (b>c) return b;
        return c;
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        Test t=new Test();
        
        System.out.println("Max of 1 and 2: " + t.max(1, 2));        
        System.out.println("Max of 1, 2 and 3: " + t.max(1, 2, 3));
    }
}
