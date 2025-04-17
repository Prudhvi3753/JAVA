public class SecondMax {
    public static void main(String[] args) {
        int arr[]={15,23,4,56,6123};
        int max=arr[0],secmax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax&&arr[i]!=max){
                secmax=arr[i];
            }
           
        }
        System.out.println("maximum number="+max);
        System.out.println("Second max="+secmax);
    }
}
