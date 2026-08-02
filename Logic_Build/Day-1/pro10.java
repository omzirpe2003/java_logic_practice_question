public class pro10 {
    public void pattern9(int n) {
        int totalRow=n*2-1;
        for(int i=1;i<=totalRow;i++){
            int patt;
            if(i<=n) patt =i;
            else patt  =(2*n)-i;
            for(int j =1;j<=patt;j++){
                System.out.print("*\t");
            }
            System.out.println(""); 
        }
    }
    public static void main(String[]args){
        pro10 pbj=new pro10();
        pbj.pattern9(4);
    }
}
