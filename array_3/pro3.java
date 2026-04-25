/*
 * chek id an array is a palindrom or not
 */


import java.util.*;
class Pro3{
	
	void fun(int arr[],int size){
		int i=0;
		int j=size-1;
		boolean isPal=true;
		while (i<j){
			int start=arr[i];
			int end=arr[j];
			if(start!=end){
				isPal=false;
				break;
			}
			i++;
			j--;
		}
		if(isPal)
			System.out.println("Is Palindrom");
		else
			System.out.println("Not this is not Palindrom");
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
		Pro3 obj=new Pro3();
		obj.fun(arr,size);
	}
}
