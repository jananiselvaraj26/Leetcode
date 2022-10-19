class Solution {
    public int trap(int[] height) {
        
        int res=0;
        int n=height.length;
        
        
        if(n>2){
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        //finding lmax
        lmax[0]=height[0];
        rmax[n-1]=height[n-1];
        
        //precompute lmax
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(height[i],lmax[i-1]);
        }
        //precompute rmax
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(height[i],rmax[i+1]);
        }
        for(int i=1;i<n;i++){
            res+=(Math.min(lmax[i],rmax[i])-height[i]);
        }
        }
        return res;
    }
}