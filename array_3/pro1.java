/*
 * check with arr is in aceding order
 */

import java.util.*;
class Pro1{
	
	void fun(int arr[],int size){
		int count=1;
		for(int i=0;i<size-1;i++){
			if(arr[i]<arr[i+1]){
				System.out.println("Count: "+count);
				count++;
			}else{
				break;
			}

		}
		if(count==size){
			System.out.println("In Acceding order");
		}else
			System.out.println("Not In Accding Order");
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
		Pro1 obj=new Pro1();
		obj.fun(arr,size);
	}
}
