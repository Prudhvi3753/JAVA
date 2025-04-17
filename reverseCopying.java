public class reverseCopying {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []arr1=new int[5];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[i];
        }
        for(int i=arr.length-1;i>=0;i--){
        System.out.print(arr1[i]);
        }
    }
}
