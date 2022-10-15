class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        
      int[][] table=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
            table[i][0]=i;
        }
        for(int j=0;j<=n;j++){
            table[0][j]=j;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                
                if((word1.charAt(i-1))==(word2.charAt(j-1))){
                    table[i][j]=table[i-1][j-1];
                }
                else{
                    table[i][j]=1+Math.min(table[i][j-1],Math.min(table[i-1][j],table[i-1][j-1]));
                     // System.out.println(table[i][j]);
                }
            }
        }
        
       
        return table[m][n];
    }
}