

/*
 * 1A 2B 3C
 * 1A 2B 3C
 * 1A 2B 3C
 */

class Pro6{
	void fun(){
		int x=3;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print((j+1)+""+(char)(65+j)+"\t");
			}
			System.out.println("");
			
		}
	}

	public static void main(String[]args){
		Pro6 obj=new Pro6();
		obj.fun();
	}
}
