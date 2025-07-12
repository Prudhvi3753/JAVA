/*public class MYThread implements Runnable {
    public void run(){
        int i=1;
        while (true) { 
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String[] args){
        MYThread m=new MYThread();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while (true) { 
            System.out.println(i+"World");
            i++;
        }
    }
}*/

//Multithreading using runnable in the different classes

class ThreadTest implements Runnable{
    public void run(){
        int i=1;
        while (true) { 
            System.out.println(i+"Hello");
            i++;   
        }
    }
}
public class MYThread{
    public static void main(String[] args){
        ThreadTest m=new ThreadTest();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while (true) { 
            System.out.println(i+"World");
            i++;   
        }
    }
}
