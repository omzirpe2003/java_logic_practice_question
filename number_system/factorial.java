

//Factorial 


import java.util.*;
class Pro2{

	public static void main(String[]args){
		int x=5;	

		int fact=1;
		for(int i=1;i<=x;i++){
		//	if(x%i==0)
				fact*=i;

			System.out.println(fact);
		}
		System.out.println("Facorial: "+fact);
	}
}
