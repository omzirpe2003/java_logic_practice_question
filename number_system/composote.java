
import java.util.*;
class Pro1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				count++;
			else
				continue;

		}
		if(count>2)
			System.out.println("The given number is composite: "+num);
		else{
			System.out.println("The given number is not an a composite: "+num);

		}
	}
}


