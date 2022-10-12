class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
      int start=0;
      
        int prev_petrol=0;
        int curr_petrol=0;
      for(int i=0;i<gas.length;i++){
       curr_petrol+=gas[i]-cost[i];
          if(curr_petrol<0){
              start=i+1;
              prev_petrol+=curr_petrol;
              curr_petrol=0;
          }
          
      }
        return (curr_petrol+prev_petrol)>=0?(start):-1;
    }
}