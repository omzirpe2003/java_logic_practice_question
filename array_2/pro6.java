
/*
 * vovle and consonunt count
 */


import java.util.*;
class Pro6{

	void fun(char arr[],int size){
		int vo=0;
		int con=0;
		for(int i=0;i<size;i++){
			if(arr[i]=='A' || arr[i] =='E' || arr[i] == 'I' || arr[i] =='O' || arr[i] =='U' )
				vo++;
			else
				con++;

		}
		System.out.println("Consonants are: "+vo+" volwes: "+con);
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next().charAt(0);
		}
		for(int i =0;i<size;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
		Pro6 obj=new Pro6();
		obj.fun(arr,size);
	}
}
