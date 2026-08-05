
public class pro4 {
    public int GCD(int n1, int n2) {
        int range=n1>n2?n2:n1;
        int gcd=1;
        for(int i=1;i<=range;i++){
            if((n1%i==0)&&(n2%i==0)){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] var0) {
        pro4 var1 = new pro4();
        int count =var1.GCD(4,6);
        System.out.println(count);
    }
}
