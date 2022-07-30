class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> newlist = new ArrayList<>();
        
        newlist.add(new ArrayList<Integer>());
        for(int i=0; i<nums.length ; i++){
            int n = newlist.size();
            
            for(int j=0; j<n ; j++){
            List<Integer>  set = new ArrayList<>(newlist.get(j));
                set.add(nums[i]);
            newlist.add(set);
            
            }    
            
            
        }
        
        
        
        
        return newlist ;
        
    }
}