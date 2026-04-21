
/*
 * Career Suggestion: A student has passed his 12th standard exam; he thinks he might get marks up to 85 percent. Suggest the better career field depending upon the marks assumption. (Use hardcoded values for percentages like $>85.00$, $75.00-85.00$, and $65.00-75.00$).
 *
 */

class Pro4{
	public static void main(String[]args){
		float x=88.2f;

		if(x>=80 && x<=100){
			System.out.println("Doctor");
		}else if(x>=65 && x<80){
			System.out.println("Engeering");

		}else if(x>=40 && x<=64){
			System.out.println("Low");
		}else if(x>=35  && x<40 ){
			System.out.println("Buisness");
		}else {
			System.out.println("Fail");
		}
	}
}
