/*
 *reverse the array and print alternet element
 */

import java.util.*;
class Pro8{
	void fun(char arr[],int size){
		char arr2[]=new char[size];
		for(int i=0;i<size;i++){
			arr2[i]=arr[size-i-1];
		}
		System.out.println("After reverse");
		for(int i=0;i<size;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println("");
		System.out.println("Before reverse");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
			i++;
		}
		System.out.println("");
		System.out.println("After reverse");
		for(int i=0;i<size;i++){
			System.out.print(arr2[i]+"\t");
		}
		System.out.println("");



		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		char arr[]=new char[size];
		Pro8 obj=new Pro8();
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
			//System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		obj.fun(arr,size);
	}
}
