

/*
 * the given number occures more than 2 time or equal 2 time
 */


import java.util.*;
class Pro4{

	int fun(int arr[],int size,int spc){
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]==spc)
				count++;
		}
		return count;
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
		System.out.print("Enter Number To Find the occurence in array: ");
		int spc=sc.nextInt();
		Pro4 obj=new Pro4();
		int count=obj.fun(arr,size,spc);
		System.out.println("The count for number "+spc+ " is: "+ count);
	}
}
