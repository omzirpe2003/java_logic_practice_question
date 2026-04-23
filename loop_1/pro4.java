

/* A C E
 * G I K
 * M O Q
 */

class Pro4{
	void fun(){
		int x=3;
		int num=65;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				System.out.print((char)num+"\t");
				num+=2;
			}
			System.out.println("");
		}
	}

	public static void main(String[]args){
		Pro4 obj=new Pro4();
		obj.fun();
	}
}
