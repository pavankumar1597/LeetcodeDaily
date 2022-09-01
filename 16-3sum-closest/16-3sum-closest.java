class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        
        int min = Integer.MAX_VALUE ;
        int msum = 0  ; 
        
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int j = i +1; 
            int k = nums.length-1 ;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k]; 
                int diff = 0 ; 
                    if(sum == target){
                        return sum ;
                    }else if(sum > target){
                        diff=  sum-target ;
                        k--;
                    }else{
                        diff=  target -sum ; 
                        j++;
                }
                if(min > diff){
                    min = diff ;
                    msum = sum ;
                }
            }
        }
        
        
        return msum  ;
        
    }
}