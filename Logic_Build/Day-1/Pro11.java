public class Pro11 {
    public void pattern9(int n) {
       
        for(int i=0;i<n;i++){
            
            for(int j =0;j<=i;j++){
                // if(i%2==0){
                //     if(j%2==0) System.out.print("1\t");
                //     else System.out.print("0\t");
                // }else{
                //     if(j%2==0) System.out.print("0\t");
                //     else System.out.print("1\t");
                // }
                System.out.print((i + j) % 2 == 0 ? "1\t" : "0\t");
            }
            System.out.println(""); 
        }
    }
    public static void main(String[]args){
        Pro11 pbj=new Pro11();
        pbj.pattern9(4);
    }
}
