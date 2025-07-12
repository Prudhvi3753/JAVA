/*class Mythread extends Thread{
    
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"hello");
            i++;
        }
    }
}
public class ThreadTest{
    public static void main(String[]args){
        Mythread t=new Mythread();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"world");
            i++;
        }
    }
}
    */

//using thread class in the same class

public class ThreadTest extends Thread{
    public void run(){
        int i=1;
        while(true){
        System.out.println(i+"hello");
        i++;
        }
    }
    public static void main(String[] args){
        ThreadTest t=new ThreadTest();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}
