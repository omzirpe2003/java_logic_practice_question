/*
 * first duplicate element in an array and return its index
 */



import java.util.*;
class Pro4{
	
	void fun(int arr[],int size){
		boolean found=false;

		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					System.out.println("ELement: "+arr[i]);
					System.out.println("Index: "+i);
					found=true;
					break;
				}
			}
			if(found)
				break;
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
		Pro4 obj=new Pro4();
		obj.fun(arr,size);
	}
}
