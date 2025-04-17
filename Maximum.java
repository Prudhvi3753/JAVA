
public class Maximum {
    public static void main(String[] args) {
        int arr[]={15,23,4,56,6};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
        System.out.println("maximum number="+max);
    }
    
}
