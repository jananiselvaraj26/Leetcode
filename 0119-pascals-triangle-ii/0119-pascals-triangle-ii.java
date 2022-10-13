class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<=rowIndex;i++){
            int leftIndex=0;
            int rightIndex=i;
            List<Integer> curr=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==leftIndex || j==rightIndex){
                    curr.add(1);
                }
                else{
                    
                    int prev=result.get(i-1).get(j-1);
                    int next=result.get(i-1).get(j);
                    
                    curr.add(prev+next);
                    
                    
                }
            }
            result.add(curr);
        }
        
        
        
        return result.get(rowIndex);
    }
}