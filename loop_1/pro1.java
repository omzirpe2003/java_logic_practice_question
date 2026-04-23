
/* $# $# $#
 * $# $# $#
 * $# $# $#
 */

class Pro1{
	void fun(int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("$#\t");
			}
			System.out.println("");
		}
	}

	public static void main(String[]args){
		Pro1 obj=new Pro1();
		obj.fun(3,3);
	}
}
