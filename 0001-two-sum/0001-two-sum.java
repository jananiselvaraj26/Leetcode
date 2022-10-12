class Solution {
    public int[] twoSum(int[] nums, int target) {
       int arr[] = new int[2];
//             for(int i=0;i<nums.length;++i){
//                 for(int j=i+1;j<nums.length;j++){
//                     if((nums[i]+nums[j])==target){
//                         arr= new int[]{i, j};

//                     }
//                 }
//             }
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++ ){
            int opposite=target-nums[i];
            if(map.containsKey(opposite)){
                Integer firstIndex = map.get(opposite);
                arr=new int[]{firstIndex,i};
            }
            else{
                map.put(nums[i],i);
            }
        }
            return arr;
        }
    
}