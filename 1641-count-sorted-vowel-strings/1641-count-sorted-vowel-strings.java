class Solution {
    public int countVowelStrings(int n) {
       int a=1;
       int e=1;
        int i=1;
        int o=1;
        int u=1;
        
        while(n>0){
            o=o+u;
            i=i+o;
            e=e+i;
            a=a+e;
            n--;
        }
        return a;
    }
}