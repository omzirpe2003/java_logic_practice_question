

//stop when spc char come

import java.util.*;
class Pro10{

	void fun(char arr[],int size,char spc){
		for(int i=0;i<size;i++){
			if(spc==arr[i]){
				System.out.print(arr[i]+"\t");
				break;
			}
			else
				System.out.print(arr[i]+"\t");
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
		System.out.print("Enter Spc Char: ");
		char spc=sc.next().charAt(0);
		Pro10 obj=new Pro10();
		obj.fun(arr,size,spc);
	}
}
