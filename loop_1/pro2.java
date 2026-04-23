



/*  1 2 3
 *  1 2 3
 *  1 2 3
 */

class Pro2{

	void fun(){
		int x=3;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print((j+1)+"\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		Pro2 obj=new Pro2();
		obj.fun();
	}
}
