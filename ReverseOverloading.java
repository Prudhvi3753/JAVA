import java.util.Arrays;
public class ReverseOverloading {
    static int reverse(int b){
        int sum=0;
        while(b!=0){
            int temp=b%10;
            sum=(sum*10)+temp;
            b/=10;
        }
        return sum;
    }
    int [] revrse(int a[]){
        int c[]=new int[a.length];
        for(int i=a.length-1,j=0;i>=0;i--,j++)
            c[j]=a[i];
        return c;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        int b=123;
        System.out.println(reverse(b));
        ReverseOverloading d=new ReverseOverloading();
        int[] reversed=d.revrse(a);
    
    System.out.println(Arrays.toString(reversed));
    }
}
