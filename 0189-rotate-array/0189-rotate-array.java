class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length)
             k=k%nums.length;
        
        //follow same as left rotate but kvalue change it to (length-k)
        k=(nums.length-k);
         reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
        
    }
    
    public static void reverse (int[] arr,int start,int end){
        
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
}