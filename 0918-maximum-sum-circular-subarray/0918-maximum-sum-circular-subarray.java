class Solution {
    
    /**
    1)first find Max subarray sum uing kadane algorithm
    2)find max circular sum array by inverting the values in array and then find max subarray using same kadane(find min of submarray for circular array)
    3) get max from both normalsum and circular sum.
    
    */
    public int maxSubarraySumCircular(int[] nums) {
        
        int res=0;
        int normalMax=kadane(nums);
        if(normalMax<0){
            return normalMax;
        }
        else{
            int arrSum=0;
            
            for(int i=0;i<nums.length;i++){
                arrSum+=nums[i];
                nums[i]=-nums[i];
            }
            arrSum+=(kadane(nums));
            
            
            return Math.max(arrSum,normalMax);
        }
        
    }
    
    public int kadane(int[] nums){
        
        int res=nums[0];
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
           max=Math.max(nums[i],(nums[i]+max));
            
            res=Math.max(max,res);
        }
        
        return res;
    }
}