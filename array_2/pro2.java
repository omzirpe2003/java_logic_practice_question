
/*
 * Max and min Diff in the array
 */


import java.util.*;
class Pro2{

	void fun(int arr[],int size){
		int min=0;
		int max=0;
		for(int i=0;i<size;i++){
			if(arr[i]>=max){
				max=arr[i];
			}
		}
		for(int i=0;i<size;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}

		System.out.println("Diff: "+ (max-min));
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		Pro2 obj=new Pro2();
		obj.fun(arr,size);
	}
}
