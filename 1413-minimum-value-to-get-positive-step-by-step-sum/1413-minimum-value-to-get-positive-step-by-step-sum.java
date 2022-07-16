class Solution {
    public int minStartValue(int[] nums) {
        
        
        int min = nums[0];
        
        
        
        for(int i =1;i < nums.length;i++){
            
            
            nums[i] = nums[i] +nums[i-1];
           min = Math.min(min,nums[i]);
            
        }
        
        
        return Math.abs((min-1)>=0?1:min-1);
        
        
        
    }
}