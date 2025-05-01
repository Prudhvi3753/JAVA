public class Gcd {
    static int gcd(int a,int b){
        while(a!=b){
        if(a>b)a=a-b;
        else b=b-a;
    }
    /*if a>b means subtract the b value from a and b>a the subtract a value from b till we reach the both values equal */
    return a;
    }
    public static void main(String[] args) {
        int a=25,b=15;
        System.out.println(gcd(a,b));   
    }
}
