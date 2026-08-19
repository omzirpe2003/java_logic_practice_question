
public class pro3 {
    public int[] bubbleSort(int[] arr) {
        buble(arr,arr.length);
        return arr;
    }

    public void buble(int arr[],int n){
        if(n==1)return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        buble(arr,n-1);
    }
    public static void main(String[] args) {
        pro3 obj=new pro3();
        int arr[]=new int[]{8,4,2,1,5,3};
        int arr2[]=obj.bubbleSort(arr);
        for(int i :arr2){
            System.out.println(i+" ");
        }
    }    
}
