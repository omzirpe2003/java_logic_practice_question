import java.util.*;
class Pro1{
	
	void fun(int arr[],int size){
		for(int i=0;i<size;i++){

		}
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
		Pro1 obj=new Pro1();
		obj.fun(arr,size);
	}
}
