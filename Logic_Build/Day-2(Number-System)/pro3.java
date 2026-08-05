
public class pro3 {
    public boolean patten3(int n) {
        int rev=0;
        int outTemp=n;
         while(n!=0){
            int temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        return rev==outTemp?true:false;
    }
    public static void main(String[] var0) {
        pro3 var1 = new pro3();
        boolean count =var1.patten3(121);
        System.out.println(count);
    }
}
