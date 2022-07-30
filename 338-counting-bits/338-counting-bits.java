class Solution {
    public int[] countBits(int n) {
        
        int[] g = new int[n+1] ;
        
        
        for(int i = 1 ;i<= n; i++){
            
            //we have found a pattern , the count of setbit in every number is equal to the count of setbit in its half the number; 
            //if the number is even then the count is equal to count of its half the number 
            // if number is odd count of setbit in its half of the number and +1 ; 
                
            g[i] = g[i>>1]+ (i&1);
                
            
        }
        
        return g;
        
        
    }
}