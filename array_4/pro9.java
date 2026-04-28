/*
 *array is desinding order or not
 */

import java.util.*;
class Pro9{
	void fun(int arr[],int size){
		int count=0;
		for(int i=0;i<size;i++){
			int temp=arr[i];
			int mach=0;
			while(temp!=0){
				int temp2=temp%10;
				mach=mach*10 + temp2;

				temp/=10;
			}
			if(mach==arr[i])
				count++;
		}
		System.out.println("Count of Palindrom: "+count);
	
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro9 obj=new Pro9();
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
