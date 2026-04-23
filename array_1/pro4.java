	
import java.util.*;
class Pro4{

	void fun(int arr[],int size,int spc){
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				arr[i]=1;
				System.out.print(arr[i]);
			}else{
				
				arr[i]=0;
				System.out.print(arr[i]);
			}

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
		System.out.print("Enter Spn Number: ");
		int spc=sc.nextInt();
		Pro1 obj=new Pro1();
		obj.fun(arr,size,spc);
	}
}

