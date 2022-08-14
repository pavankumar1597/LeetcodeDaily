class Solution {
    public int pivotIndex(int[] nums) {

        for(int i = 1 ; i < nums.length ; i++){    
            nums[i] = nums[i-1]+nums[i] ;
        }
        
        for( int i = 0 ; i < nums.length ; i++){
            int right = 0;
            if(i == 0 ) right = 0;
            else right =nums[i-1];
            
            int left = nums[nums.length-1] - nums[i];
            
            if(left == right) return i ;
        }
        
        
        return -1;
        
    }
}