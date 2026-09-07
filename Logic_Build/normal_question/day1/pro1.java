package day1;
class Demo{
    void swap(int x,int y){
        System.out.println("X:- "+x);
        System.out.println("Y:- "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("X:- "+x);
        System.out.println("Y:- "+y);
    }

    boolean evenOrOdd(int x){
        if(x%2==0) return true;
        return false;
    }

    int secLarge(int arr[]){
        int f=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }
            if(f>arr[i] && arr[i]>s&&arr[i]!=f)
                s=arr[i];
        }
        return s;
    }

    int sumOfNumber(int num){
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num/=10;
        }
        return sum;
    }

    int reverse(int num){
        int revers=0;
        while(num!=0){
            revers=revers*10 + (num%10);
            num/=10;
        }
        return revers;
    }

    boolean prime(int num){
        for(int i=2; i<num;i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }

    boolean palindrom(int num){
        int reverse=0;
        int temp=num;
        while(num!=0){
            reverse=reverse*10 + num%10;
            num/=10;
        }
        return reverse==temp?true:false;
    }

    public static void main(String[] args) {
        Demo oj=new Demo();
        oj.swap(10, 30);
        boolean x= oj.evenOrOdd(3);
        System.out.println(("is:- ")+(x ? "Even":"Odd"));
        int arr[]={5,5,3};
        int result=oj.secLarge(arr);
        System.out.println("SecLarge: "+result);
        System.out.println("Sum Of 12345 is: "+oj.sumOfNumber(12345));
        System.out.println("Reverse Of 12345 is: "+oj.reverse(12345));
        System.out.println("Check Primse or not:- "+(oj.prime(5)?"Yes":"No"));
        System.out.println("Check Palindrom or not:- "+(oj.palindrom(1231)?"Yes":"No"));
    }

}