import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class pro1 {
    //Brut Fouse Approch  o(n)
     public int[] divisors(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }

        int index=0;
        int result[]=new int[count];
        for(int i=1;i<=n;i++){
            if(n%i==0){
                result[index]=i;
                index++;
            }
        }
        return result;
    }
    //Best Approch o(root n)
    public int[] divisors2(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0  ){
                list.add(i);
                if(i!=n/i)
                    list.add(n/i);
            }
        }
        Collections.sort(list);
        int result[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }
     public static void main(String[] var0) {
        pro1 var1 = new pro1();
        int count[] =var1.divisors(36);
        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
    }
}
