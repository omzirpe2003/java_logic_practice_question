


/*
if count >2 then cube 
else not found in array
 */

import java.util.*;
class Pro3{
	void fun(int arr[],int size, int spc){
		int count=0;		
		for(int i=0;i<size;i++){
			if(spc==arr[i]){
				count++;
			}

		}
		if(count>=2){
			for(int i=0;i<size;i++){
				if(arr[i]==spc){
					arr[i]=arr[i]*arr[i]*arr[i];
				}
				System.out.print(arr[i]+"\t");
			}
			System.out.println("");
		}else{
			System.out.println("Not present in array");
		}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of array: ");
		int size =sc.nextInt();
		int arr[]=new int[size];
		Pro3 obj=new Pro3();
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			//System.out.print(arr[i]+"\t");
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		System.out.print("Enter Spc Number: ");
		int spc=sc.nextInt();

		obj.fun(arr,size,spc);
	}
}
