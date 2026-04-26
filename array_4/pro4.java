


/*
 take 2 array and prit commen element
 */

import java.util.*;
class Pro4{
	void fun(int arr1[],int arr2[],int size){
		System.out.print("Commen elements: ");
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size;j++){
				if(arr1[i]==arr2[j]){
					System.out.print(arr1[i]+"\t");
					break;
				}
			}
		}
		System.out.println("");

	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array1 and array 2: ");
		int size =sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		Pro4 obj=new Pro4();
		System.out.println("Enter Element in the array 1: ");
		for(int i=0;i<size;i++){
			arr1[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}
		System.out.println("Enter Element in the array 2: ");
		for(int i=0;i<size;i++){
			arr2[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}

		System.out.println("Array 1 elements: ");
		for(int i=0;i<size;i++){
			System.out.print(arr1[i]+"\t");
		}
		System.out.println("");
		System.out.println("Array 2 elements: ");
		for(int i=0;i<size;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println("");

		obj.fun(arr1,arr2,size);
	}
}
