
public class pro2 {
    //brute fouce
    public boolean isPrime(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
        }
        return count>=3?false:true;
    }
    //optimmize
    public boolean isPrime2(int n) {
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
     public static void main(String[] var0) {
        pro2 var1 = new pro2();
        int n=36;
        boolean count =var1.isPrime2(n);
        System.out.println("Is "+n + " "+count);
    }
}
