/*
 * print count of digit in element in array 
 */



import java.util.*;
class Pro5{
	
	void fun(int arr[],int size){
		for(int i=0;i<size;i++){
			int num=arr[i];
			int count=0;
			while(num!=0){
				int temp=num%10;
				count++;
				num/=10;
				
			}
			System.out.print(count);
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
		Pro5 obj=new Pro5();
		obj.fun(arr,size);
	}
}
