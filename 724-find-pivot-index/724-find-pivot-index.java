class Solution {
    public int pivotIndex(int[] nums) {
        
           int[] arr = new int[nums.length+1];
        arr[0] = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            arr[i+1] = arr[i]+nums[i] ;
            
        }
        
        for( int i = 1 ; i < arr.length ; i++){
            
            int right = arr[i-1];
            int left = arr[arr.length-1] - arr[i];
            
                
                if(left == right){
                    return i-1 ;
                }
        }
        
        
        return -1;
        
    }
}