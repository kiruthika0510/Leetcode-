class Solution {
    public boolean isPalindrome(int x) {
         int a=x;
        int n=0;
        int rev=0;
        while(a>0){
            n=a%10;
            rev=(rev*10)+n;
            a/=10;
        }
        if(rev==x){
            return true;
        }
        return false;
    }
}