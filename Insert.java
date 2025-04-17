public class Insert {
    public static void main(String [] args){
        int s=5;
        int insert=2;
        int value=5;
        int []arr=new int[s];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        for(int i=s-1;i>insert;i--){
            arr[i]=arr[i-1];
        }
        arr[2]=value;
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
    
}
