

/*
 *
 * A person is storing date, month, and year in variables.
(Write a code to print the date, month, year, and also print total seconds in a day, month, and year)
*/

class Pro6{
	public static void main(String []args){
		int day=21;
		int month=4;
		int year=2026;

		int secInDay=24*60*60;
		int secInMonth=12*secInDay;
		int secInYear=365*secInDay;

		System.out.println("Date: " + day + "/" + month + "/" + year);
        	System.out.println("Seconds in Day: " + secInDay);
       	 	System.out.println("Seconds in Month: " + secInMonth);
        	System.out.println("Seconds in Year: " + secInYear);	
	}
}

