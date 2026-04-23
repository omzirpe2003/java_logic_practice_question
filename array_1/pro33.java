
	
import java.util.*;
class Pro1{

	int fun(int arr[],int size,int spc){
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]==spc){
				count++;	
			}
		}
		return count;
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
		System.out.print("Enter Spn Number: ");
		int spc=sc.nextInt();
		Pro1 obj=new Pro1();
		int count=obj.fun(arr,size,spc);
		System.out.println("Count: "+count+" element: "+spc);
	}
}

