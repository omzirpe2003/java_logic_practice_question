

/*
 * reverse Array
 */
import java.util.*;
class Pro5{

	void indexReverse(int arr[],int size){
		for(int i=size;i>0;i--){
			System.out.print(arr[i]+ "\t");
		}
	}

	void elementReplace(int arr[],int size){
		int start=0;
		int end=size-1;
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reverse Array");
		for(int j=0;j<size;j++){
			System.out.print(arr[j]+"\t");
		}
		System.out.println("");
	}

	void newArray(int arr[],int size){
		int rev[]=new int[size];
		for(int i=0;i<size;i++){
			rev[i]=arr[size-1-i];
			System.out.print(rev[i]+"\t");
		}
		System.out.println("");
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
		Pro5 obj=new Pro5();
		obj.newArray(arr,size);
	}
}
