class Solution {
    public int[] countBits(int n) {
        
        
        
        
        int[] g = new int[n+1] ;
        
        
        for(int i = 1 ;i<= n; i++){
            g[i] = g[i>>1]+ (i&1);
                
            
        }
        
        return g;
        
        
    }
}