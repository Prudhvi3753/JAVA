public class Copy {
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,6};
        int []arr1=new int[6];
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]);
        }
    }
}
