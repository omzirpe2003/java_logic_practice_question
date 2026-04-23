/*
 *
 * 1 1 1
 * 2 2 2 
 * 3 3 3
 */

class Pro3{

	void fun(){
		int x=3;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print((i+1)+"\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		Pro3 obj=new Pro3();
		obj.fun();
	}
}
