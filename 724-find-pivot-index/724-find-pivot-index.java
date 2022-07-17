class Solution {
    public int pivotIndex(int[] nums) {
        
        
        
        int[] prefix =new int[nums.length];
        
        
        prefix[0] = nums[0];
        for(int i = 1 ; i < nums.length;i++ ){
        
            prefix[i] = nums[i] +prefix[i-1];
            
        }
        
        
        
        
        for(int i = 0  ; i < nums.length ;i++){
            int li = 0 ;
            int ri = 0; 
            
            
            if(i > 0)
             li = preff(prefix,0,i-1);
            
            ri = preff(prefix,i+1,nums.length-1);
            
            if(li == ri){
                return i ;
            }
        }
            return -1 ;

    }
    
    
    
    
    int preff(int[] prefix , int l ,int r){
        
        
        if(l == 0){
        
            return  prefix[r] ;  
       
        }else{
            
            return prefix[r] - prefix[l-1];
            
            
        }
        
    }
}