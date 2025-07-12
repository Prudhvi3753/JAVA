public class CheckedUnchecked {
    static void fun1(){
        System.out.println(10/0);
    }
    static void fun3(){
        fun1();
    }
    public static void main(String[] args) {
     fun3();   
    }
}
