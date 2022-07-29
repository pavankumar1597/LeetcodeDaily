class Solution {
    public int xorOperation(int n, int start) {
        int xx =  0 ; 
        
        for(int i = 0 ; i < n ; i++)  xx ^= start+2*i ;
        
        return xx ;
        
    
    }
}