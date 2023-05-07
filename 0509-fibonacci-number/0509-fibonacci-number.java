class Solution {
    public int fib(int num) {
         int[] dp = new int[num+1];
        Arrays.fill(dp, -1);
       return fibo(num ,dp);
    }
    
    
    
         int fibo(int n, int[] dp   ){
        if(n <=1 ){
            dp[n] = n ; 
            return n ;
        }

        if(dp[n] == -1){
            dp[n] = fibo(n-1,dp)+fibo(n-2,dp); 
        }
       return dp[n];
    }
}