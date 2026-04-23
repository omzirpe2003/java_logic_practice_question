

/*
 * 1A 1A 1A
 * 1A 1A 1A
 * 1A 1A 1A
 */


class Pro5{
	void fun(){
		int x=3;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print("1A\t");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		Pro5 obj=new Pro5();
		obj.fun();
	}
}
