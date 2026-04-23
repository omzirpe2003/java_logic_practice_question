
	
import java.util.*;
class Pro7{

	void fun(int arr[],int size){
		for(int i=0;i<size;i++){
			if(size%2==0)
				System.out.print(arr[i]+"\t");
			else 
				System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
		Pro7 obj=new Pro7();
		obj.fun(arr,size);
	}
}

