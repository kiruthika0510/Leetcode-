class Solution {
    public int heightChecker(int[] heights) {
        int count =0;
        int[] SH=heights.clone();
        Arrays.sort(SH);
        for(int i=0;i<SH.length;i++){
            if(heights[i]!=SH[i]){
               count++;
            }
        }
        return count;

    }
}