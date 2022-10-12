class Solution {
    public int climbStairs(int n) {
        //fib
        if(n>3){
            int first=1;
            int second=2;
            int sum=0;
            for(int i=3;i<=n;i++){
               sum=first+second;
                first=second;
                second=sum;
                // System.out.println(sum);
                
            }
            return second;
        }
        else{
            return n;
        }
        
        
    }
}

/**
n=1 1
n=2 1,1 or 2
n=5 1,1,1,1,1
    1,1,1,2
    1,1,2,1
    1,2,1,1
    2,1,1,1
    2,2,1
    2,1,2
    1,2,2
     total 8
n=6 1,1,1,1,1,1
    1,1,1,1,2
    1,1,1,2,1
    1,1,2,1,1
    1,2,1,1,1
    2,1,1,1,1
    2,2,1,1
    2,1,2,1
    2,1,1,2
    1,2,2,1
    1,1,2,2,
    2,2,2,1
    1,2,2,2
    total 13
    fib
    
     

*/