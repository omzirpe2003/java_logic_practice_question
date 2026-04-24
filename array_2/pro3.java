
/*
 * second largest Element in array
 */

import java.util.*;
class Pro3{

	int fun(int arr[],int size){
		int max=0;
		int secMax=0;
		for(int i=0;i<size;i++){
			if(arr[i]>max){
				secMax=max;
				max=arr[i];

			}else if(arr[i]>secMax && arr[i]!=max){
				secMax=arr[i];
			}
		}
		return secMax;
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
		Pro3 obj=new Pro3();
		int max=obj.fun(arr,size);
		System.out.println("Max: "+max);
	}
}
