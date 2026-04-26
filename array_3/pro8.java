import java.util.*;
class Pro8{
	
	void fun(int arr[],int size){
		int secMin=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<size;i++){
			if(arr[i]< min){
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<secMin && arr[i]!=min)
				secMin=arr[i];

		}
		System.out.println("min: "+min);
		System.out.println("Sec_min: "+secMin);
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		Pro8 obj=new Pro8();
		obj.fun(arr,size);
	}
}
