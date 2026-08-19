
public class selection {
    public int[] selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        selection obj=new selection();
        int arr2[]=new int[]{4,2,3,8,9,5};
        int arr[]=obj.selectionSort(arr2);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }    
}
