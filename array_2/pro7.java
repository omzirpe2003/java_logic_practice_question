/*
 *
 * lover case to uppercase convert
 */


import java.util.*;
class Pro7{

	void fun(char arr[],int size){
		for(int i=0;i<size;i++){
			arr[i]=(char)(arr[i]-32);
			System.out.print((char)(arr[i])+"\t");
		}
		System.out.println("");
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i =0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		Pro7 obj=new Pro7();
		obj.fun(arr,size);
	}
}
