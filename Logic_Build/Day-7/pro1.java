public class pro1 {
    public int[] insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;

                j--;
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        pro1 obj=new pro1();
        int arr[]=new int[]{1,8,2,4,7,9,0};
        int arr2[]=obj.insertion(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }    
}
