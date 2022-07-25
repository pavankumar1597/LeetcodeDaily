public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        
        int c =0 ; 
        for(int i = 1 ;i<=32 ; i++)
        {
            
            int bit =  (n >>i) & 1; 
            if(bit == 1 ){
                c++;
            }
            
        }
        
        return c ;
        
        
    }
}