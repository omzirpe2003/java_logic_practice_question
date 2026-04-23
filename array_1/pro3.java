
import java.util.*;
class Pro2{

	void fun(int arr[],int size,int spc){
		System.out.print("Enter Special Num: ");
		int num=spc;
		for(int i=0;i<size;i++){
			if(arr[i]==num){
				System.out.println("Number "+num+ " First occurresd at index: "+i);
				break;
			}
		}
		
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size= sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		int spc=sc.nextInt();

		Pro1 obj=new Pro1();
		obj.fun(arr,size,spc);
	}
}

