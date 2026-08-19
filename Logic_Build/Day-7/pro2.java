public class pro2 {
    public int[] margeSort(int arr[],int low,int high){
        if(low>=high) return arr;
        int mid=low + (high - low) / 2;
        margeSort(arr, low, mid);
        margeSort(arr, mid+1, high);
        marge(arr,low,mid,high);
        return arr;
    }

    public void marge(int arr[],int low,int mid,int high){
        int result[]=new int[high - low + 1];
        int left=low;
        int right=mid+1;
        int index = 0;

        // Compare both halves
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                result[index] = arr[left];
                left++;
            } else {
                result[index] = arr[right];
                right++;
            }

            index++;
        }
        while (left <= mid) {
            result[index] = arr[left];
            left++;
            index++;
        }

        // Copy remaining right elements
        while (right <= high) {
            result[index] = arr[right];
            right++;
            index++;
        }
        // Copy result back to original array
        for (int i = 0; i < result.length; i++) {
            arr[low + i] = result[i];
        }

    }
    
    public static void main(String[] args) {
        pro2 obj=new pro2();
        int arr[]=new int[]{1,8,5,3,6,9};
        int arr2[]= obj.margeSort(arr, 0, arr.length-1);
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }    
}
