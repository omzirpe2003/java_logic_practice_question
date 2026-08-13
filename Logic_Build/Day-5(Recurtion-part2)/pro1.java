class Solution {
    public void reverse(int[] arr, int n) {
        reverseArray(arr,0,n-1);
    }
    public void reverseArray(int arr[],int i,int j){
        if(i>=j) return;

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        reverseArray(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
        int arr[]=new int[]{1,2,3,4,5,6};
        obj.reverse(arr,arr.length );
    }
}

