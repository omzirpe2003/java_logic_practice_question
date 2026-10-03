package day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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


    String uniqString(String str){
        String result="";
        System.out.println(str.length());
        for(int i=0;i<str.length();i++){
            boolean dub=false;
            for(int j=0;j<result.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    dub=true;
                    break;
                }
            }
            if(!dub){
                result+=str.charAt(i);
            }
                
        }
        return result;
    }

    void removeDouplicateInArray(int[] arr ){
        int pointer=0;
        for(int num:arr){
            System.out.print(num);
        }
        System.out.println(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[pointer]!=arr[i]){
                arr[++pointer]=arr[i];
            }
        }
        System.out.println("Pointer Len:- "+pointer);
        for(int i=0;i<arr.length;i++){
            if(pointer<i){
                System.out.println("Removing el: "+arr[i]);
                arr[i]=0;
            }
                
        }
        
        for(int num:arr){
            System.out.print(num);
        }
        System.out.println(" ");
       
    }

    void reverseWord(String str){
        StringBuffer result=new StringBuffer();
        int end=str.length()-1;
        while(end >= 0){

            //Remove End Space
            while(str.charAt(end)==' ')
                end--;

            //find Start of word
            int start=end;
            
            while(start>=0&&str.charAt(start)!=' ')
                start--;


            //add the word in result
            for(int i=start+1;i<=end;i++){
                result.append(str.charAt(i));
            }

            //add space
            if(start>0)
                result.append(" ");

            //set End 
            end =start-1;

        }
        System.out.println(result);
    }

    String reversStringOpt(String str){
        String[] strArray=str.split(" +");
        StringBuffer result=new StringBuffer();
        for(int i=strArray.length-1;i>=0;i--){
            result.append(strArray[i]);
            if(i!=0)
                result.append(" ");
        }
        return result.toString();
    }

    

    //Day-3

    void findLargestSubString(String str){
        for(int i=0;i<str.length();i++){
            String subStr="";
            for(int j=i;j<str.length();j++){
                subStr+=str.charAt(j);
            }
            System.out.println(subStr+" ");
        }
    }

    int findLargestSubStringOpt(String str){
        int l=0;
        int r=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<str.length()){
           
            if(map.containsKey(str.charAt(r))&& map.get(str.charAt(r))>=l){
                l=map.get(str.charAt(r))+1;  
            }
            map.put(str.charAt(r),r);
            int len= r - l + 1;
            if(len>max)
                max=len;

             r++;

        }

        System.out.println(max);
        return max;
    }

    void union(int arr1[],int arr2[]){

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        for(int num:set){
            System.out.println(num+" ");
        }
    }

    void unionOpt(int arr1[],int arr2[]){
        int union[]=new int[arr1.length+arr2.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            
            if(arr1[i]<arr2[j]){
                if(k==0 ||union[k-1]==arr1[i]){
                    union[k++]=arr1[i];
                }
                i++;
            }else if(arr2[j]<arr1[i]){
                if(k == 0 || union[k-1]==arr2[j]){
                    union[k++] = arr2[j];
                }
                j++;
            }else{
                if(k==0 ||union[k-1]==arr1[i]){
                    union[k++]=arr1[i];
                }
                i++;
                j++;
            }


        }
        while (i < arr1.length) {

        if (k == 0 || union[k - 1] != arr1[i]) {
            union[k++] = arr1[i];
        }

        i++;
    }

    
}
    //day-4

    int maxWaterinContaner(int []arr){

        int maxWater=0;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<arr.length;j++){
                int w=j-i;
                int h= arr[i]>arr[j]?arr[j]:arr[i];
                int water=w*h;
                maxWater=water>maxWater?water:maxWater;
            }
        }

        System.out.println("Anser is :"+maxWater);
        return maxWater;
    }

    int optMaxWaterInContaner(int []arr){
        int maxWater=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int w=right-left;
            int h=arr[right]<arr[left] ? arr[right] : arr[left];
            int currWater=w*h;
            maxWater=currWater>maxWater?currWater:maxWater;
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }

        }
        System.out.println(maxWater);
        return maxWater;
    }


//   02/10/2026
    //3 Sum Brute Force
    public List<List<Integer>> brouteForce3sum(int arr[]){
        
        List<List<Integer>> list =new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> triplet=Arrays.asList(
                            arr[i],
                            arr[j],
                            arr[k]
                        );
                        Collections.sort(triplet);
                        if(!list.contains(triplet))
                            list.add(triplet);
                    }
                }
            }
        }

        return list;
    }

    // 3Sum Adv Brute force
    List<List<Integer>> advBrute3Sum(int arr[]){
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int toFind = 0 + arr[i] + arr[j];
                if(set.contains(toFind)){
                    List<Integer> triplet =Arrays.asList(
                        arr[i],
                        arr[j],
                        arr[toFind]
                    );
                     Collections.sort(triplet);
                    if(!list.contains(triplet))
                        list.add(triplet);


                }
                set.add(arr[j]);
            }
        }

        return list;
    }

    //3Sum Opt
    List<List<Integer>> opt3Sum(int arr[]){
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;

            int j=i+1;
            int k=arr.length-1;
            while (j<k){

                int sum =arr[i] +arr[j] +arr[k];
                if(sum ==0){
                    List<Integer> triplet =Arrays.asList(
                        arr[i],
                        arr[j],
                        arr[k]
                    );
                    if(!list.contains(triplet))
                        list.add(triplet);

                    while(j<k && arr[j]==arr[j+1])
                        j++;
                    while(j<k && arr[k]==arr[k-1])
                        k--;
                    j++;
                    k--;                    
                }else if(sum>0){
                    k--;
                }else
                    j++;

            }
        }

        return list;
    }

    // 3Sum closest broute force
    int closest3Sum(int arr[], int target){
        int closest =arr[0]+arr[1]+arr[2];
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                for(int k=j+1;k<arr.length;k++){
                    int sum= arr[i]+arr[j] +arr[k];
                    if(sum==target)
                        return sum;
                    int diff1= sum - target;
                    int diff2 = closest - target;
                    if(diff1<0)
                        diff1 = -diff1;
                    if(diff2 < 0)
                        diff2 = -diff2;

                    if(diff1< diff2)
                        closest = sum;

                }
            }

        }
        return closest;
    }

    // 3Sum closest Opt
    int closest3SumOpt(int arr[], int target){
        int closest =arr[0]+arr[1]+arr[2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            int left = i+1;
            int right = arr.length -1 ;
            while(left < right){
                int sum =arr[i] +arr[left] + arr[right];
                if(sum<target)
                    left ++;
                else if(sum > target )
                    right --;
                else if(sum == target)
                    return sum;

                int diff1 = sum - target;
                int diff2 =closest - target;
                if(diff1<0)
                    diff1 = - diff1;
                if(diff2 < 0)
                    diff2 = -diff2;
                if(diff1<diff2)
                    closest = sum;
            }
        }
        return closest;
    }


    //03/10/2026
    List<Integer> partitionLable(String str){
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();


        //Find Last Ocurence
        for(int i=0;i<str.length();i++){
            char arr =str.charAt(i);
            if(map.containsKey(arr))
                map.put(arr, i);
            else
                map.put(arr,i);
            
        }
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            System.out.println("Char Last Ocr-> "+entry.getKey()+" at position-> "+entry.getValue());
        }

        //Find Partation
        for(int i=0;i<str.length();i++){
            int j=i;
            int k=map.get(str.charAt(i));
            while (j<k){
                if(k < map.get(str.charAt(j)))
                    k=map.get(str.charAt(j));
                j++;
            }
            System.out.println("Partition Length is: " + (j - i + 1));
            list.add(j-i+1);
            i= j+1;

        }

        return list;
    }


    List<Integer> partitionLableOpt(String str){
        List<Integer> list=new ArrayList<>();
        int left = 0; 
        int right = 0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int apper=str.lastIndexOf(ch);
            if(apper>right)
                right=apper;
            if(i==right){
                list.add(right-left+1);
                left=i+1;
            }
        }

        return list;
    }



    public static void main(String[] args) {
        Demo oj=new Demo();
        //System.out.println(oj.uniqString("bcabc"));
        int arr[]={-1,2,1,-4};
        
        // List<List<Integer>>ressult = oj.advBrute3Sum(arr);
        // for(List<Integer> x : ressult ){
        //     System.out.println(x);
        //     for(Integer y : x)
        //         System.out.println(y);
        // }

        //int result =oj.partitionLable(arr, 1);
        //System.out.println(result);
        List<Integer> result= oj.partitionLableOpt("ababcbacadefegdehijhklij");
        for(int i:result)
                System.out.println(i);
    }

}