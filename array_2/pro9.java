/*
 *
 * REPLCAE THE elemt without ranage in a-z
 *
 */


import java.util.*;
class Pro9{

	void fun(char arr[],int size){
		for(int i=0;i<size;i++){
			if((int)arr[i]>=97 && (int)arr[i]<=122)
				continue;
			else
				arr[i]='#';
		}

		for(int i=0;i<size;i++){
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
		Pro9 obj=new Pro9();
		obj.fun(arr,size);
	}
}
