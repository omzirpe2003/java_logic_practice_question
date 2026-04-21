/*
 *
 * Pythagorean Triplets: Write a program in Java to accept three numbers and check whether they are Pythagorean triplets or not (Condition: $a^2 + b^2 = c^2$).
 */

class Pro9{
	public static void main(String[]args){
		int x=3;
		int y=4;
		int z=5;

		if(((x*x)+(y*y))==(z*z)){
			System.out.println("Pythagorean triplets");
		}else {
			System.out.println("Not Pythagorean triplets");
		}
	}
}
