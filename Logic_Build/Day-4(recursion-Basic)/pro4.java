
public class pro4 {
     public int factorial(int n) {
        if(n==0) return 1;
       return n * factorial(--n);
    }
    public static void main(String[]args){
        pro4 obj=new pro4();
        System.out.println(obj.factorial(5));
    }  
}
