/*
 *Find 3rd Largest number
 */

import java.util.*;
class Pro10{
	void fun(int arr[],int size){
		int large=0;
		int secLarge=0;
		int threerdLarge=0;
		for(int i=0;i<size;i++){
			if(arr[i]>large){
				threerdLarge=secLarge;
				secLarge=large;
				large=arr[i];
			}else if(arr[i]>secLarge && arr[i]!=large){
				threerdLarge=secLarge;
				secLarge=arr[i];
			}else if(arr[i]>threerdLarge && arr[i]!=secLarge && arr[i]!=large){
				threerdLarge=arr[i];
			}
		}
		System.out.println("Thred Largest: "+threerdLarge);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro10 obj=new Pro10();
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		obj.fun(arr,size);
	}
}
