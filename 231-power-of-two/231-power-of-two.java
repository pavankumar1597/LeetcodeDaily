class Solution {
    public boolean isPowerOfTwo(int n) {
        
        long ele = 1 ;
        
            while( n >= ele){
                  if(n == ele ){
                return true ;
            }
            ele = ele<<1;
          
        }
        
                        return false ;

    }
}