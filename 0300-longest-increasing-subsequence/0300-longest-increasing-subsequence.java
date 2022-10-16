class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis=new int[nums.length];
        lis[0]=1;
        for(int i=1;i<nums.length;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    lis[i]=Math.max(lis[j]+1,lis[i]);
                }
            }
        }
        
        int res=lis[0];
        for(int i=1;i<nums.length;i++){
            res=Math.max(res,lis[i]);
        }
        return res;
        
    }
}