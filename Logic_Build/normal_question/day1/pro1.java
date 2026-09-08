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


    //Day-2
    int large(int arr[]){
        int large=0;
        if(arr.length<1)return 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }

    int small(int arr[]){
        int small=arr[0];
        if(arr.length<1)return 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }

    int sumAndAverageOfArray(int arr[]){
        int avr=0;
        for(int i=0;i<arr.length;i++){
            avr+=arr[i];
        }
        return avr;
    }

    void countEvenAndOddNumber(int arr[]){
        int  even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("Even Count Is: "+even);
        System.out.println("Odd Count Is: "+odd);
    }

    void reverseArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reverse Array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    int secLatge(int arr[]){
        int f=0;
        int sec=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>f){
                sec=f;
                f=arr[i];
            }
            if(f>arr[i] && sec<arr[i] && arr[i]!=f){
                sec=arr[i];
            }
        }
        return sec;
    }

    int secSmall(int arr[]){
        int f=arr[0];
        int sec=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<f){
                sec=f;
                f=arr[i];
            }
            if(f<arr[i] && sec>arr[i]){
                sec=arr[i];
            }
        }
        return sec;
    }

    void duplicateEle(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Douplicate Ele: "+arr[j]);
                    break;
                }
            }
        }
    }

    void removeDouplicate(int arr[]){
        int temp[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean ch=false;
            for(int j=0;j<k;j++){
                if(arr[i]==temp[j]){
                    ch=true;
                    break;
                }
            }
            if(!ch){
                temp[k]=arr[i];
                k++;
            }
        }

        for(int i=0;i<k;i++){
            System.out.println(temp[i]);
        }
    }
    public static void main(String[] args) {
        Demo oj=new Demo();
        //oj.swap(10, 30);
        // boolean x= oj.evenOrOdd(3);
        // System.out.println(("is:- ")+(x ? "Even":"Odd"));
        
        //int result=oj.secLarge(arr);
        // System.out.println("SecLarge: "+result);
        // System.out.println("Sum Of 12345 is: "+oj.sumOfNumber(12345));
        // System.out.println("Reverse Of 12345 is: "+oj.reverse(12345));
        // System.out.println("Check Primse or not:- "+(oj.prime(5)?"Yes":"No"));
        // System.out.println("Check Palindrom or not:- "+(oj.palindrom(1231)?"Yes":"No"));
        // System.out.println("Check largest Number in array:- "+(oj.large(arr)));
        // System.out.println("Check Small Number in array:- "+(oj.small(arr)));
        // System.out.println("Sum of array is "+(oj.sumAndAverageOfArray(arr)+ " And Avrg is :- "+(oj.sumAndAverageOfArray(arr)/arr.length)));
        // oj.countEvenAndOddNumber(arr);
        int arr[]={10, 20, 20, 30, 40, 40, 50};
        // oj.reverseArr(arr);
        // System.out.println("SecLarge: " +oj.secLatge(arr));
        // System.out.println("SecSmall: " +oj.secSmall(arr));
        //oj.duplicateEle(arr);
        oj.removeDouplicate(arr);


    }

}