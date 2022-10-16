class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum=0;
        int max=0;
        int min=0;
       for(int i: nums){
           prefixSum+=i;
           min=Math.min(min,prefixSum);
           max=Math.max(max,prefixSum);
       }
        return max-min;
    }
}