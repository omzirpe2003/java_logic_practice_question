/*
 *if array element in rang of 65 to 90 then print the Char value (ASCII value)
 */

import java.util.*;
class Pro7{
	void fun(int arr[],int size){
		boolean isDesc=true;
		for(int i=0;i<size;i++){
			if(arr[i]>=65 && arr[i]<=90){
				System.out.print((char)(arr[i])+"\t");
			}else
				System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro7 obj=new Pro7();
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
