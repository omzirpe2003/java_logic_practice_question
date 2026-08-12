
public class pro2 {
    public void printNumbers(int n) {
        if(n==0) return;
        System.out.println(n--);
        printNumbers(n);
    }
    public static void main(String[]args){
        pro2 obj=new pro2();
        obj.printNumbers(5);
    }  
}
