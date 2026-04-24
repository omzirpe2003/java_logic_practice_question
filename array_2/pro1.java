

//average of array 
//avg=sum/count;

import java.util.*;
class Pro1{

	int fun(int arr[],int size){
		int sum=0;
		for(int i=0;i<size;i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i =0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		Pro1 obj=new Pro1();
		int sum=obj.fun(arr,size);
		System.out.println("Avg Is: "+sum/size);
	}
}
