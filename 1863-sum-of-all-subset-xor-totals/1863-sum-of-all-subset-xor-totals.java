class Solution {
    public int subsetXORSum(int[] nums) {
        return recuring(0,nums,0);
    }
    
    int recuring(int idx ,int[] nums , int sum ){

        if(idx == nums.length){
            return sum ; 
        }
        int xsum = recuring(idx+1,nums,sum ^ nums[idx]);
        int ssum = recuring(idx+1,nums,sum);

        return xsum + ssum ; 
    }
    
}