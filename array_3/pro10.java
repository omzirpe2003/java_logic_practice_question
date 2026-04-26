/*
 * Factorial Of Each number in array
 */



import java.util.*;
class Pro10{
	void fun(int arr[],int size){
		System.out.print("Factorial is : ");
		for(int i=0;i<size;i++){
			int fact=1;
			for(int j=1;j<=arr[i];j++)
				fact*=j;
			System.out.print(fact+"\t");
		}
		System.out.println("");
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
		Pro10 obj=new Pro10();
		obj.fun(arr,size);
	}
}
