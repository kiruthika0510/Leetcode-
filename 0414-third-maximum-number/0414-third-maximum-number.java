class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for( int i=0;i<n;i++){
            if(n>=3){
            return nums[i];
        }
    }
           return n-1;
    }
}