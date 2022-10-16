class Solution {
    public int lengthOfLIS(int[] nums) {
    /** approach using DP
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
     *
     */
        /**Approach using binary search*/
       int[] tail=new int[nums.length];
        int res=1;
        tail[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>tail[res-1]){
                tail[res]=nums[i];
                res++;
            }
            else{
                int index=ceilIndex(tail,0,res-1,nums[i]);
                tail[index]=nums[i];
            }
        }
    return res;    
    }
    
    public int ceilIndex(int[] tail,int l,int r,int x){
        
        while(r>l){
            int m=l+(r-l)/2;
            if(tail[m]>=x){
              r=m;
            }
            else{
                l=m+1;
            }
            
            
        }
        return r;
    }
    
    
    
}