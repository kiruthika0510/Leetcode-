class Solution {
    public int[] sortArray(int[] nums) {
       /* int temp=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                   temp=nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;
                }
            }
        }
        return nums;*/
        Arrays.sort(nums);
        return nums;
    }
}