class Solution {
    public int pivotIndex(int[] nums) {

        for(int i = 1 ; i < nums.length ; i++){    
            nums[i] = nums[i-1]+nums[i] ;
        }
        
        
        
        for( int i = 0 ; i < nums.length ; i++){
          int  right = (i == 0 )? 0 :nums[i-1];
            if(nums[nums.length-1] - nums[i] == right) return i ;
        }
        
        
        return -1;
        
    }
}