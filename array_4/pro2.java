/*
 sum of prime number + count of prime number
 */

import java.util.*;
class Pro2{
	void fun(int arr[],int size){
		boolean isDesc=true;
		int sum=0;
		int count=0;
		
		for(int i=0;i<size;i++){
			int itrCount=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					itrCount++;
				}
			}
			if(itrCount==2){
				System.out.println("Prime Number: "+arr[i]);
				count++;
				sum+=arr[i];
			}	
		}
		System.out.println("Sum Of all prime number: "+sum+" and count of prime numnebr in array: "+count);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro2 obj=new Pro2();
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
