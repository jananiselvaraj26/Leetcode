class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<Integer>();
        int[] ans=new int[rowIndex+1];
        ans[0]=1;
        for(int i=1;i<=rowIndex;i++){
            for(int j=i;j>0;j--){
                ans[j]=ans[j]+ans[j-1];
            }
        }
        for(int i:ans){
            res.add(i);
        }
      return res;
    }
}