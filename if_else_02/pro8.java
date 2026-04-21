

/*
 * Grading System: Write a program to check whether the student passed with: first class with distinction, first class, second class, pass, and fail according to his percent grades. (Define your own ranges for the grades).
 */

class Pro8{
	public static void main(String[]args){
		int marks=90;
		if(marks>=90 && marks<=100){
			System.out.println("first class with distinction");
		}else if(marks>=80 && marks<90){
			System.out.println(" first class");
		}else if(marks>=60 && marks<80){
			System.out.println("second class");
		}else if(marks >=35 && marks<60){
			System.out.println("Pass");
		}else if(marks >=1 && marks<35){
			System.out.println("Fail");
		}else {
			System.out.println("Invalid number");
		}
	}
}

