

/*
 *
 * 3. Even/Odd + Greater Than 10

Write a program to:

Check whether the number is even or odd
Also check whether the number is greater than 10 or not
(Take hardcoded values)

*/

class Pro3{
	public static void main(String[]args){
		int x=14;
		if(x>10&& x%2==0){
			System.out.println("Even Number greater thne 10: "+x);
		}else if(x>10 && x%2!=0){
			System.out.println("Odd Number greater thne 10: "+x);
		}else{	
			System.out.println("Less thne 10: "+x);
		}
	}
}
