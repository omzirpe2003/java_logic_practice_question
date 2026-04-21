

/*
 * 4. Uppercase or Lowercase

Write a program to check whether the given character is:

UPPERCASE (Capital)
or lowercase
(Take hardcoded values)
*/

class Pro4{
	public static void main(String[]args){
		int x=65;

		if(x>=65 && x<=90){
			System.out.println("uppercase");
		}else if(x>=97 && x<=122){
			System.out.println("Lovercase");
		}else{
			System.out.println("Wrong Number");
		}
	}
}
