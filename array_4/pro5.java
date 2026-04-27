


/*
 take 2 array and combine it and prit the array element
 */

import java.util.*;
class Pro5{
	void fun(int arr1[],int arr2[],int size1,int size2){
		
		int newSize=size1+size2;
		int arr3[]=new int[newSize];
		for(int i=0;i<newSize;i++){
			if(size1>i)
				arr3[i]=arr1[i];
			else
				arr3[i]=arr2[i-size1];
		}
		for(int i=0;i<newSize;i++){
			System.out.print(arr3[i]+"\t");
		}
		System.out.println("");

	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array1: ");
		int size1 =sc.nextInt();
		System.out.print("Enter Size Of array 2: ");
		int size2 =sc.nextInt();

		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		Pro5 obj=new Pro5();
		System.out.println("Enter Element in the array 1: ");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}
		System.out.println("Enter Element in the array 2: ");
		for(int i=0;i<size2;i++){
			arr2[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}

		System.out.println("Array 1 elements: ");
		for(int i=0;i<size1;i++){
			System.out.print(arr1[i]+"\t");
		}
		System.out.println("");
		System.out.println("Array 2 elements: ");
		for(int i=0;i<size2;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println("");

		obj.fun(arr1,arr2,size1,size2);
	}
}
