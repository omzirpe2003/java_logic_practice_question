
/*
 * i/p:-10,20,30,40,50,60
 * o/p:-25,35,45,55,65,75
 */

import java.util.*;
class Pro1{

	void fun(int arr[],int size){
		for(int i=0;i<size;i++){
			arr[i]+=15;
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}

		Pro1 obj=new Pro1();
		obj.fun(arr,size);
	}
}

