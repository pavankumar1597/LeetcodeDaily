class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1; 
        int s = 0 ;
        while(n > 9){
            s += n%10 ;
            p *= (n != 0 ) ? n%10 : 1 ;
            n = n/10 ; 
        }
        
          s += n%10 ;
            p *= (n != 0 ) ? n%10 : 1 ;
        
        
        return p-s ;
        
        
    }
}