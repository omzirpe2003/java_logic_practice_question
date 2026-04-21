

/*8. Divisible by 2, 5, 10

Write a program to check if the given number is divisible by 2, 5, and 10.
If not, print:
"Is Not Divisible By 2,5,10"
(Take hardcoded values)
*/

class Pro8{
	public static void main(String[]args){
		int x=10;
		if(x%2==0){
			System.out.println("Divi By 2");

		}else if(x%5==0){
			System.out.println("Divi By 5");
		}else if(x%10==0){
			System.out.println("Divi By 10");
		}else{
			System.out.println("Is Not Div By 2,5,10");
		}
	}
}
