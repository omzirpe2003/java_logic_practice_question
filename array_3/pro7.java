/*
 * FInd Composite number
 *
 */

import java.util.*;
class Pro7{
	
	void fun(int arr[],int size){
		System.out.print("Composite number are: ");
		for(int i=0;i<size;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count>2){
				System.out.print(arr[i]+"\t");
			}
		}
		System.out.println("");
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
		Pro7 obj=new Pro7();
		obj.fun(arr,size);
	}
}
