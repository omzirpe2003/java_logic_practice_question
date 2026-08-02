public class pro8 {
    public void patten7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(n*2)-(2*i +1);j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[]args){
        pro8 obj=new pro8();
        obj.patten7(4);
    }    
}

