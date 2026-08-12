public class pro1 {
    int num=1;
    public void printNumbers(int n) {
        if(n<num) 
            return;
        System.out.println(num++);
        printNumbers(n);
    }    public static void main(String[]args){
        pro1 obj=new pro1();
        obj.printNumbers(5);
    }
}