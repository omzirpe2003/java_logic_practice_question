
/*
 *given array conrains elemeent multiple of user given i/p  int value if yes then print index
 */

import java.util.*;
class Pro6{
	void fun(int arr[],int size,int spc){
		boolean isFound=false;
		for(int i=0;i<size;i++){
			if(arr[i]%spc==0){
				System.out.println("An Element multiple of "+spc+" found at index: "+i);
				isFound=true;
			}
		}
	
		if(!isFound)
			System.out.println("Element Not found: "+spc);
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro6 obj=new Pro6();
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		System.out.print("Enter Spc number: ");
		int spc=sc.nextInt();
		obj.fun(arr,size,spc);
	}
}
