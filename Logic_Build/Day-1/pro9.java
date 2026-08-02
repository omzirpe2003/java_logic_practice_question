public class pro9 {
    public void pattern9(int n) {
        int totalRow=n*2-1;
        for(int i=1;i<=totalRow;i++){
            int space;
            int patt;
            if(i<=n){
                space=n-i;
                patt= 2*i-1;
            }else{
                space=i-n;
                patt=2*(totalRow -i)+1;
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=patt;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args){
        pro9 pbj=new pro9();
        pbj.pattern9(4);
    }
}