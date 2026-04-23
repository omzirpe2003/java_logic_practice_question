
/*
 * d c b a
 * d c b a 
 * d c b a 
 */

class Pro7{

	void fun(){
		int x=4;
		
		for(int i=0;i<x;i++){
			int num=96+x;
			for(int j=0;j<x;j++){
				System.out.print((char)(num--)+"\t");		
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		Pro7 obj=new Pro7();
		obj.fun();
	}
}


