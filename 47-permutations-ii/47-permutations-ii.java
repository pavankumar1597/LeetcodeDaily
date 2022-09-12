class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        solve(0,nums,ans,new ArrayList<Integer>());  
        
       return new ArrayList<>(ans) ; 
    }
    
    
   void solve(int i, int[] nums, Set<List<Integer>> ans , ArrayList<Integer> list  ){
        
        if(i >= nums.length ){
            ans.add(help(nums));
       return  ;     
        }
       
       for(int j = i ; j < nums.length ; j++){
           if(j > i && nums[j] == nums[j-1])
               continue ;
           swap(i , j, nums);
        solve(i+1,nums,ans,new ArrayList<Integer>());  
           swap(i , j, nums);
       }
       
        
        
        
        
        
    }
    
      private List<Integer> help(int[] nums){
      List<Integer> current = new ArrayList<>();
      for(int num: nums){
        current.add(num);
      }
      return current;
    }
    
    
    
    
    int[] swap(int i , int j , int[] nums){
        int t   =  nums[i];
        nums[i] = nums[j];
        nums[j] = t ;
        return nums ;
        
    }
}