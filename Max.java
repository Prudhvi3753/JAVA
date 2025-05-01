public class Max {
    static  int max(int x,int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static void main(String [] args){
        int a=12;
        int b=23;
        int c=max(a,b);
        System.out.println("Max number:"+c);
    }    
}
