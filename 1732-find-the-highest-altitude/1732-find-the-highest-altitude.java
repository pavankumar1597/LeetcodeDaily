class Solution {
    public int largestAltitude(int[] gain) {
        
        
        
        
        
        
        int max = gain[0]>0 ?gain[0]:0 ;
        
        
        for(int i = 0 ; i < gain.length;  i++){
            if(i > 0){
                gain[i] = gain[i]+gain[i-1] ;
              max =  Math.max(gain[i],max);
            }
            
        }
        
        return max ;
        
    }
}