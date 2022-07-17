class Solution {
    public int pivotIndex(int[] prefix) {
        
        
        for(int i = 1 ; i < prefix.length;i++ ){
        
            prefix[i] = prefix[i] +prefix[i-1];
            
        }
        
        
        
        
        for(int i = 0  ; i < prefix.length ;i++){
            int li = 0 ;
            int ri = 0; 
            
            
            if(i > 0)
             li = prefix[i-1];
            
            ri = prefix[prefix.length-1] - prefix[i];
            
            if(li == ri){
                return i ;
            }
        }
            return -1 ;

    }
    
    

    
}