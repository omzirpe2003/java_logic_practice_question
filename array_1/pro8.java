//Composite number
	
import java.util.*;
class Pro8{

	void fun(int arr[],int size){
		
		for(int i=0;i<size;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0)
					count++;
			}
			if(count>2){
				System.out.print(arr[i]+"\t");
				System.out.println("");
			}
			//System.out.println("");
		}
	
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
		Pro8 obj=new Pro8();
		obj.fun(arr,size);
	}
}

