package day1;

import java.util.HashMap;
import java.util.Map;

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
    
    void frequencyOfArray(int arr[]){
        boolean isRepet[]=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            if(isRepet[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    isRepet[j]=true;
                }
            }
            System.out.println(arr[i]+" Frequ:-"+count);
        }
    }
    
    void frequencyOfArrayOpti(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entory :map.entrySet()){
            System.out.println(entory.getKey()+" Frq "+entory.getValue());
        }
    }    

    void mostRepetedNumber(int arr[]){
        boolean isRead[]=new boolean[arr.length];
        int mapCount=0;
        int ele=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(isRead[i])
                continue;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    isRead[j]=true;
                }
            }
            if(count>mapCount){
                mapCount=count;
                ele=arr[i];
            }
        }
        System.out.println("Ele: "+ele+ " Count: "+mapCount);
    }
    
    void mostRepetedNumberOpt(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int maxCount=0;
        int ele=0;
        for(Map.Entry<Integer,Integer> enty : map.entrySet()){
            if(enty.getValue()>maxCount){
                maxCount=enty.getValue();
                ele=enty.getKey();
            }
        }
        System.out.println(ele+" fre:- "+maxCount);
    }

    String reverseString(String str){
        char strChar[]=str.toCharArray();
        int l=0;
        int r=strChar.length-1;
        while(l<r){
            char temp=strChar[l];
            strChar[l]=strChar[r];
            strChar[r]=temp;
            l++;
            r--;

        }
        return new String(strChar);
    }

    String reverseStringNormal(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return rev;
    }

    boolean palindrom(String str){
        char strChar[]=str.toCharArray();
        int l=0;
        int r=strChar.length-1;
        while(l<r){
            char temp=strChar[l];
            strChar[l]=strChar[r];
            strChar[r]=temp;
            l++;
            r--;

        }
        String rev= new String(strChar);
        return rev.equals(str)?true:false;
    }
    
    boolean palindromOpt(String str){
        int s=0;
        int l=str.length()-1;
        while(s<l){
            if(str.charAt(s)!=str.charAt(l)){
                return false;
            }
            s++;
            l--;
        }
        return true;
    }

    void countVovelAndConso(String str){
        int vovel=0;
        
        for(int i=0;i<str.length();i++){
            if( str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'|| str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u' ){
                vovel++;
            }
        }
        System.out.println("Vovel :- "+ vovel);
        System.out.println("Conso :- "+ (str.length() - vovel));
    }

    int countOfWords(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) != ' ') && (i==0 || str.charAt(i-1)==' ')){
                count++;
            }
        }
        return count;
    }

    boolean anagram(String str1,String str2){
        if(str1.length()!=str2.length()) 
            return false;
        boolean visit[]=new boolean[str1.length()];
        for(int i=0;i<str1.length();i++){
            boolean vis=false;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str2.charAt(j) &&!visit[j]){
                    visit[j]=true;
                    vis=true;
                    break;
                }
            }
            if(!vis){
                return false;
            }
        }
        return true;

    }

    boolean anagramDemo(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;

        boolean visitedArray[]=new boolean[str1.length()];
        for(int i=0;i<str1.length();i++){
            boolean visit=false;
            for(int j=0;j<str1.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    visit=true;
                    visitedArray[j]=true;
                    break;
                }
            }
            if(!visit)
                return false;

        }
        return true;
    }

    boolean anagramOpt(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }else
                map.put(ch, map.get(ch)-1);
        }

        for(int count:map.values()){
            if(count!=0){
                return false;
            }
        }


        return true;
    }

    void charFrequncy(String str){
        boolean[] visited=new boolean[str.length()];
        for(int i=0;i<str.length();i++){
            if(visited[i])
                continue;
            int count=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(str.charAt(i)+" Frq: "+count);
        }
    }

    int firstUniqChar(String str){
        for(int i=0;i<str.length();i++){

            boolean uniq=true;
            for(int j=0;j<str.length();j++){

                if(j!=i && str.charAt(i)==str.charAt(j)){
                    uniq=false;
                    break;
                }
            }
            if(uniq)
                return i;
        }

        return -1;
    }

    int firstUniqCharOpt(String str){
        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Demo oj=new Demo();
        System.out.println(oj.firstUniqCharOpt("swiss"));


    }

}