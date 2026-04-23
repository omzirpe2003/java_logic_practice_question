


/*
 * 1 2 3
 * 3 4 5
 * 5 6 7
 */


class Pro8{

	void fun(){
		int x=3;
		int num=1;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print(num+++"\t");
			}
			num--;
			System.out.println("");
		}
	}
	public static void main(String[]args){
	
		Pro8 obj=new Pro8();
		obj.fun();
	}
}
