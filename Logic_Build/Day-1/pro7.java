public class pro7 {
    public void patten7(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print("\t");
            }
            
            //number
            for(int j=0;j<i*2+1;j++){
                System.out.print("*\t");
            }
             System.out.println("");
        }
    }
    public static void main(String[]args){
        pro7 obj=new pro7();
        obj.patten7(4);
    }    
}

