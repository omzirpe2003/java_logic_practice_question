
public class pro3 {
    public int NnumbersSum(int N) {
       if(N==1) return 1;
       return N + NnumbersSum(--N);
    }
    public static void main(String[]args){
        pro3 obj=new pro3();
        System.out.println(obj.NnumbersSum(5));
    }  
}
