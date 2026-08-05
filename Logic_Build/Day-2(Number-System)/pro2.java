
class pro2 {
    public int patten2(int n) {
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=(rev*10)+temp;
            n/=10;
        }
        return rev;
    }
      public static void main(String[] var0) {
      pro2 var1 = new pro2();
      int count =var1.patten2(123);
        System.out.println(count);
    }
}