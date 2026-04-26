


/*
 *array is desinding order or not
 */

import java.util.*;
class Pro1{
	void fun(int arr[],int size){
		boolean isDesc=true;
		for(int i=0;i<size-1;i++){
			if(arr[i+1]>arr[i]){
				isDesc=false;
				break;
			}
		}
		if(isDesc){
			System.out.println("Is In descinding Order");
		}else{
			System.out.println("is Not in Descinding order");
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro1 obj=new Pro1();
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]+"\t");
		}
		obj.fun(arr,size);
	}
}
