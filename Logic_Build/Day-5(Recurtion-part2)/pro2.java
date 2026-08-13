class Solution {   
    public boolean palindromeCheck(String s) {
        return checkPal(s,0);
        String rev=revser(s,0);
    }
    


    public boolean checkPal(String s,int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return checkPal(s,i+1);
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
        boolean ans=obj.palindromeCheck("MAM");
        System.out.println(ans);
    }
}