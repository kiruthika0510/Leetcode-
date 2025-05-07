class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int present=0;
        for(int i=0;i<gain.length;i++){
            present+=gain[i];
            max=Math.max(max,present);
        }
        return max;
    }
}