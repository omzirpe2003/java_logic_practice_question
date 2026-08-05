
public class pro5 {
    public boolean isArmstrong(int n) {
        int outNum=n;
        int strong=0;
        while(n!=0){
            int temp=n%10;
            n/=10;
            strong=(temp*temp*temp)+ strong;
        }
        if(outNum==strong) return true;
       return false; 
    }
    public static void main(String[] var0) {
        pro5 var1 = new pro5();
        boolean count =var1.isArmstrong(15);
        System.out.println(count);
    }

}
