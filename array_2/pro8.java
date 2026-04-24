/*
 *
 * print occurrenace in the array
 */

import java.util.*;
class Pro8{

	int fun(char arr[],int size,char spc){
		int count=0;
		for(int i=0;i<size;i++){
			if(spc==arr[i])
				count++;
		}
		return count;
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
		System.out.print("Enter charctor: ");
		char spc=sc.next().charAt(0);
		Pro8 obj=new Pro8();
		int count=obj.fun(arr,size,spc);
		System.out.println("Spc: "+spc+" Occurese: "+count);
	}
}
