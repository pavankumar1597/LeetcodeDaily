class Solution {
    public int minSubArrayLen(int B, int[] nums) {
                
       
        
        
        int i =0 ;
        int j =0 ; 
        int length = Integer.MAX_VALUE ; 
        
        int sum = 0 ;
        while( j < nums.length){
            sum += nums[j++] ;
      
                    
              while( sum >= B ){ 
                  
                 length =  Math.min(length,j-i);
                  sum = sum - nums[i];
                  i++;
                    
                }
            
            
        }
        

        
  return length == Integer.MAX_VALUE ? 0 : length;
        
        
    }
}