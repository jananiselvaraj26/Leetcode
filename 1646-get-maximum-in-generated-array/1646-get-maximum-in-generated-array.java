class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
       
        
        if(n>2){
             nums[0]=0;
        nums[1]=1;
        nums[2]=1;
            int max=1;
            for(int i=3;i<=n;i++){
                
                int first=nums[(i/2)];
                int second=nums[(i/2)+1];
                if(i%2==0){
                    nums[i]=first;
                }
                else{
                    nums[i]=first+second;
                }
                max=Math.max(max,nums[i]);
            }
             return max;
        }
       
        
        return (n==0 || n==1)?n:1;
       
    }
}