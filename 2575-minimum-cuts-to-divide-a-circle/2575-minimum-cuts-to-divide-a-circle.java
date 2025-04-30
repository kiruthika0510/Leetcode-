class Solution {
    public int numberOfCuts(int n) {
        int even=n%2;
        if(even ==0){
            return n/2;
        }
        else if(n==1){
            return 0;
        }
        else{

            return n;
        }
    }
}