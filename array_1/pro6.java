/*
 * print consonants in array
 */

	
import java.util.*;
class Pro6{

	void fun(char arr[],int size){
		for(int i=0;i<size;i++){
			if(arr[i]=='A'&&arr[i]=='E'  && arr[i]=='I' && arr[i]=='O' && arr[i]=='U'){
				continue;
			}else{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i=0;i<size;i++){
			System.out.println(arr[i]);
		}
		Pro6 obj=new Pro6();
		obj.fun(arr,size);
	}
}

