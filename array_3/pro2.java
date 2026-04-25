
/*
 * sum of even and odd
 */


import java.util.*;
class Pro2{
	
	void fun(int arr[],int size){
		int even=0;
		int odd=0;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0)
				even++;
			else 
				odd++;

		}
		System.out.println("Sum of even: "+even);
		System.out.println("Sum of odd: "+odd);
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
		Pro2 obj=new Pro2();
		obj.fun(arr,size);
	}
}
