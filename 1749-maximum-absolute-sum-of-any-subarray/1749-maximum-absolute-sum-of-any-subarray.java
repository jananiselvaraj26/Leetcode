class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        /*
       max prefix sum = max(nums[0] + ... + nums[i - 1]), where 0 <= i <= n;
min prefix sum = min(nums[0] + ... + nums[j - 1]), where 0 <= j <= n;
The above will be 0, if i == 0 and j == 0, respectively.

max abs of subarray sum = max prefix sum - min prefix sum */
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