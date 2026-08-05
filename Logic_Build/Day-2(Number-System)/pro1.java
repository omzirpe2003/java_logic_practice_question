

public class pro1 {
    
   public int patten1(int var1) {
     int count=0;
     while(var1 != 0){
        count++;
        var1/=10;
     }
     return count;

   }

   public static void main(String[] var0) {
      pro1 var1 = new pro1();
      int count =var1.patten1(0);
        System.out.println(count);
    }
}
