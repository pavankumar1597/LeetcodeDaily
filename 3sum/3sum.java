class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        Arrays.sort(nums);
        ArrayList<List<Integer>>  rlist  = new ArrayList<List<Integer>>();

            
            
            
            for(int i = 0 ; i < nums.length -2 ; i++){
              ArrayList<List<Integer>> twos =   twosum(nums,i+1,nums.length-1,0-nums[i]);
                 if(i>0 && nums[i-1] == nums[i]){
                    continue;
                }  
                
                for(List<Integer> li :twos){
                  li.add(0,nums[i]);  
                }
                    rlist.addAll(twos);
               
                  

                }
        return rlist ;
            }
        
    
    
    
    
    
    ArrayList<List<Integer>> twosum(int[] nums,int s , int e ,int target){
        
               ArrayList<List<Integer>>  mlist  = new ArrayList<List<Integer>>();

        while(s<e){
            
            
            int sum = nums[s]+nums[e];
            
            if(sum > target){
                e--;
            }else if (sum < target){
                s++;
            }else{
                
            List<Integer>  list  = new ArrayList<>();
                list.add(nums[s]);
                list.add(nums[e]);
                mlist.add(list) ;
                while(s < nums.length-1 && nums[s] == nums[s+1] ) s++;
                while(e >= s && nums[e] == nums[e-1] ) e--;
                s++;
                e--;
                
            }
            
        }
        
        return mlist ; 
        
        
    }
}