

/*  1	2	3	4
 *  2	3	4	5
 *  3	4	5	6
 *  4	5	6	7
 */

class Pro9{
	void fun(){
		int x=4;
		for(int i=0;i<x;i++){
			int num=i+1;
			for(int j=0;j<x;j++){
				System.out.print(num+++"\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		Pro9 obj=new Pro9();
		obj.fun();
	}
}
