
public class bubal {
    public int[] bubal(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        bubal obj=new bubal();
        int arr[]=new int[]{4,5,7,6,1,0};
        int []resul=obj.bubal(arr);
        for(int i=0;i<resul.length;i++){
            System.out.println(arr[i]);
        }
    
    }    
}
