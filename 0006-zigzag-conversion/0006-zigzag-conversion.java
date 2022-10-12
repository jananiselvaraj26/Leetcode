class Solution {
    public String convert(String s, int numRows) {
//       Map<Integer,String> strMap=new HashMap<Integer,String>();
//         boolean increase=true;
//         boolean decrease =false;
//         int row=1;
        
//         for(int i=0;i< s.length();i++){
            
          
//                String k= strMap.getOrDefault(row, "");
//             strMap.put(row,k+s.charAt(i));
                
//             if(increase){
//                row++;
//                 if (row==numRows){
//                     increase=false;
//                 }
//             }
//             else{
//                   row--;
//                 if(row==1){
//                     increase=true;
                   
//                 }
                
//             }
//         }
//         String ans="";
//         for(Map.Entry<Integer,String> entry : strMap.entrySet()){
//             ans+=entry.getValue();
//         }
        
//         return ans;
        
        /**Approach2**/
        
         char[] c = s.toCharArray();
    int len = c.length;
    StringBuffer[] sb = new StringBuffer[numRows];
    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
    
    int i = 0;
    while (i < len) {
        for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
            sb[idx].append(c[i++]);
        for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
            sb[idx].append(c[i++]);
    }
    for (int idx = 1; idx < sb.length; idx++)
        sb[0].append(sb[idx]);
    return sb[0].toString();
        
    }
}