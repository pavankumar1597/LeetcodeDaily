class Solution {
    public int[] decode(int[] encoded) {
        
        
        int len = encoded.length;
        int allxor =  0 ; 
        int allxorexceptone =  0 ; 
        
        int[] perm = new int[len+1];
        
        for(int i = 1 ; i <= encoded.length +1 ;i++){
            
            allxor ^= i;
        }
        
        for(int i = 1 ; i < encoded.length ;i=i+2){
            allxorexceptone ^= encoded[i] ;
        }
        
        
        perm[0] = allxorexceptone ^ allxor ; 
        
        for(int i = 0 ; i < len ; i++){
            
            perm[i+1] = perm[i] ^ encoded[i];
        }
        
        return perm ;
        
        
    }
}